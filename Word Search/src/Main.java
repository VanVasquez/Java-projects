import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String sentence = scn.nextLine();
        System.out.println("Enter a word to check: ");
        String word = scn.next();
        System.out.println(countWord(sentence, word));
    }
    private static int countWord(String sentence, String word) {
        int total = 0;
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            total++;
        }
        return total;
    }
}