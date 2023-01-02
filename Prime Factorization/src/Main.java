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