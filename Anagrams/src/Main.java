/*
    4. Anagrams
        Two words are anagrams if they contain the same letters but in a different order. 
        Here are a few examples of anagram pairs:

        “listen” and “silent”
        “binary” and “brainy”
        “Paris” and “pairs”
        For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.

        As an added challenge, for a given array of strings, return separate lists that group anagrams together. 
        For example, the input {“tar,” “rat,” “art,” “meats,” “steam”}, t
        he output should look something like {[“tar,” “rat,” “art”], [“meats,” “steam”]}.
*/

import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = getWord();
        System.out.println(anagramsGroup(words));
    }
    /*
        the work here is that the sorted word will be the 'key' for each hashmaps.
        for ex. the word is rat, first we will sort it to 'art'. the, check in groupAnagram if this 'key' exist.
        if null, then we will create a group or a new list with key of 'art', so later on, if the other words is 'tar',
        it will just add it to the map with the key of 'art'.
    */
    private static List<List<String>> anagramsGroup(String[] words) {
        Map<String, List<String>> groupAnagram = new HashMap<>();
        for (String word: words) {
            char[] letter = word.toCharArray();
            Arrays.sort(letter);
            String sorted = new String(letter);
            List<String> group = groupAnagram.computeIfAbsent(sorted, k -> new ArrayList<>()); //this was suggested by intellij, 
            group.add(word);
        }
        return new ArrayList<>(groupAnagram.values());
    }

    private static String[] getWord() {
        System.out.println("Enter any words: ");
        return scn.nextLine().split(" ");
    }
}
