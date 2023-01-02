/*
    10. Prime factorization
        The prime factors of a number are all of the integers below that number that are divisible into the number 
        as well as 1. For example, the prime factors of 12 are 1,2,3,4,6, and 12.

        Create a prime factorization calculator that returns the prime factors of any number between 2 and 100. 
        If you're looking for a more advanced version of this challenge, use exercise 9 to create a prime factorization 
        calculator for any number. Hint: think about using square roots to cut your work in half.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        System.out.println("Prime Factors: " + displayPrimeFactors(number));
        System.out.println("Prime Factorization: " + displayPrimeFactorization(number));
    }
    private static List<Integer> displayPrimeFactors(int number) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 1; i < number; i++) {
            if(number % i == 0)
                primes.add(i);
        }
        return primes;
    }
    private static List<Integer> displayPrimeFactorization(int number) {
        List<Integer> primeFactor = new ArrayList<>();

        if( number < 2 )
            return primeFactor;

        for (int i = (int) Math.sqrt(number); number > 1 && i >= 2; i--) {
            while (number % i == 0) {
                primeFactor.add(i);
                number /= i;
            }
        }
        if(number > 1) {
            primeFactor.add(number);
        }
        return primeFactor;
    }
}
