/*
    5. Pangrams
        A pangram is a sentence that contains all 26 letters of the English alphabet. 
        One of the most well-known examples of a pangram is, “The quick brown fox jumps over the lazy dog.” 
        Create a pangram checker that returns a Boolean TRUE if an input string is a pangram and FALSE if it isn’t.

        For an added pangram challenge, create a perfect pangram checker. 
        A perfect pangram is a sentence that uses each letter of the alphabet only once, such as, “Mr. Jock, TV quiz Ph.D., bags few lynx.”
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //I don't want to type pangrams so no scanner this time;
        //this is an example of perfect pangrams: "Mr. Jock, TV quiz Ph.D., bags few lynx.".
        String sentence = "The quick brown fox jumps over the lazy dog.";
        //remove unnecessary characters like . and ,;
        sentence = sentence.replaceAll("[\\s.,]", "");
        System.out.println("Normal Pangrams: " + checkIfPangrams(sentence.toLowerCase()));
        System.out.println("Perfect Pangrams: " + checkIfPangramsPerfect(sentence.toLowerCase()));
    }

    private static boolean checkIfPangrams(String sentence) {
        String[] abc = "abcdefghijklmnopqrstuvwxyz".split("");
        for(String a: abc) {
            sentence = sentence.replace(a, "");
        }
        return sentence.isEmpty();
    }
    private static boolean checkIfPangramsPerfect(String sentence) {
        char[] c = sentence.toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);
        String abc = "abcdefghijklmnopqrstuvwxyz";
        return sorted.equals(abc);
    }
}
