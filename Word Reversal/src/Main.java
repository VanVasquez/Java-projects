import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = getText();
        System.out.println(reverseSentence(words));
    }
    private static String reverseSentence(String[] words) {
        StringBuilder rev = new StringBuilder();
        for(String word:words) {
            rev.insert(0, word + " ");
        }
        String first = rev.substring(0, 1).toUpperCase();
        return first + rev.substring(1).toLowerCase();
    }

    private static String[] getText() {
        System.out.println("Enter a sentence: ");
        return scn.nextLine().split(" ");
    }
}