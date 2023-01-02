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