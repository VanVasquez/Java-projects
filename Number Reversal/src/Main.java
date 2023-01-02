/*
    6. Number reversal
        This one is a technical interview favorite. For a given input number, return the number in reverse.
        So, an input of 3956 should return 6593.

        If you’re ready for a bigger challenge, reverse a decimal number.
        The decimal point should stay in the same place. So, the number 193.56 should output 653.91.
*/

import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        double num = getNum();
        reverseNum(num);
    }

    private static void reverseNum(double num) {
        String[] number = String.valueOf(num).split("\\.");
        String left = number[0];
        String right = number[1];
        left = String.valueOf(new StringBuilder(left).reverse());
        right = String.valueOf(new StringBuilder(right).reverse());
        System.out.println(left + "." +right);
    }

    private static double getNum() {
        System.out.println("Enter any number: ");
        return scn.nextDouble();
    }
}