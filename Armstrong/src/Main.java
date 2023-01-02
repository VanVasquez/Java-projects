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