/*
    2. Find the word
        Starting with an input string of words, find the second-to-last word of the string. 
        For example, an input of “I love Codecademy” should return “love.”

        To make your program more challenging, allow for a second numerical input, n, that results
        in returning the nth word of a string. So, for the string “I can program in Java” and n = 3,
        the output should be the third word, “program.”
*/

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
