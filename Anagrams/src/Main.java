import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = getWord();
        System.out.println(anagramsGroup(words));
    }

    private static List<List<String>> anagramsGroup(String[] words) {
        Map<String, List<String>> groupAnagram = new HashMap<>();
        for (String word: words) {
            char[] letter = word.toCharArray();
            Arrays.sort(letter);
            String sorted = new String(letter);
            List<String> group = groupAnagram.computeIfAbsent(sorted, k -> new ArrayList<>());
            group.add(word);
        }
        return new ArrayList<>(groupAnagram.values());
    }

    private static String[] getWord() {
        System.out.println("Enter any words: ");
        return scn.nextLine().split(" ");
    }
}