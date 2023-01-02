import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    9. Prime number checker
        A prime number is any whole number greater than 1 whose only factors are 1 and itself.
        For example, 7 is a prime number because it’s only divisible by 1 and 7.

        Create a function that returns TRUE if an input number is prime.
        The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.

        For a slightly harder challenge, create a prime number calculator that outputs all prime numbers
        between 2 and the input number.
*/
public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a limit: ");
        int limit = scn.nextInt();
        System.out.println(displayPrimeNumbers(limit));
    }
    private static List<Integer> displayPrimeNumbers(int limit) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= limit; i++)
            if(i == 2 || i % 2 != 0)
                primes.add(i);
        return primes;
    }
}