/*
    3. Word search
        For a given input string, return a Boolean TRUE if the string starts with a given input word. 
        So, for an input string of “hello world” and input word “hello,” the program should return TRUE.

        For a more advanced word searcher, create a program that returns the number of times a word appears in an input string.
        For example, given an input word “new” and an input string “I'm the new newt,” the program should return a value of 2.
*/

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
