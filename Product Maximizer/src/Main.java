/*
    8. Product maximizer
        For a given input array of numbers, find the two that result in the largest product.
        The output should include the two numbers in the array along with their product.

        As an extra challenge, use an input of two arrays of numbers and find two numbers — one from each input array — that results in the largest product.
*/

import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String[] numbers1 = getNum();
        String[] numbers2 = getNum();
        //to get largest product, we have to multiply all numbers and check the largest value of each numbers,
        //but actually you can just sort them and take the largest number.
        System.out.println(largestProduct(numbers1, numbers2));
    }

    private static List<Integer> largestProduct(String[] numbers1, String[] numbers2) {
        List<Integer> largest = new ArrayList<>();
        Arrays.sort(numbers1, Collections.reverseOrder());
        Arrays.sort(numbers2, Collections.reverseOrder());
        largest.add(Integer.valueOf(numbers1[0]));
        largest.add(Integer.valueOf(numbers2[0]));
        return new ArrayList<>(largest);
    }

    private static String[] getNum() {
        System.out.println("Enter any numbers: ");
        String[] num = scn.nextLine().split(" ");
        return num;
    }
}
