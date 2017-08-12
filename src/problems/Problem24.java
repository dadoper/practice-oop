package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem24 {
    public static void main(String[] args) {
        System.out.println("This program allows you to see if a number is perfect number");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer input = scanner.nextInt();
            Integer S = 0; //Sum of all factors
            for (int i = 1; i < input; ++i) {
                Integer quotient = input % i;
                if (quotient == 0) {
                    S += i;
                }

            }
            if (S == input) {
                System.out.println("YUP");
            } else {
                System.out.println("NOPE");
            }
        }
    }
}
