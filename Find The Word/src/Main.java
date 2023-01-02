import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String sentence = scn.nextLine();
        System.out.println("Enter nth of word to output: ");
        int num = scn.nextInt();
        System.out.println(findTheWord(sentence, num));
    }

    private static String findTheWord(String sentence, int num) {
        String[] words = sentence.split(" ");
        return words[num-1];
    }
}