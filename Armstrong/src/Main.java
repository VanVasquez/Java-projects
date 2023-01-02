/*
    7. Armstrong numbers
        An Armstrong number is a whole number that’s equal to the sum of its digits raised to the power of the total number of digits. 
        For example, 153 is an Armstrong number because there are three digits, and 153 = 13 + 53 + 33. 
        The four-digit number 8208 is also an Armstrong number, as 8208 = 84 + 24 + 04 + 84.

        Create an Armstrong number checker that returns a Boolean TRUE if the input number is an Armstrong number. 
        Hint: to extract each digit from a given number, try using the remainder/modulo operator.

        If you’re looking for something a little more challenging, create an Armstrong number calculator that returns 
        all Armstrong numbers between 0 and the input number.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter limit: ");
        int limit = scn.nextInt();
        System.out.println(getArmstrongs(limit));
    }
    private static List<Integer> getArmstrongs(int lim) {
        List<Integer> armstrongs = new ArrayList<>();
        for(int i = 1; i <= lim; i++) {
            int size = String.valueOf(i).length();
            int total = 0;
            int nums = i;
            while(nums != 0) {
                int num = nums % 10;
                total += (int) Math.pow(num, size);
                nums /= 10;
            }
            if(total == i)
                armstrongs.add(i);
        }
        return new ArrayList<>(armstrongs);
    }
}
