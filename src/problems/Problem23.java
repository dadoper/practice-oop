package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer input = scanner.nextInt();

            Integer checkPrime = 0;
            for (int i = 1; i <= java.lang.Math.sqrt(input); ++i) {
                double quotient = input % i;
                if (quotient == 0.00) {
                    checkPrime++;
                }

            }
            if (checkPrime == 1) {
                System.out.println("YUP");
            } else {
                System.out.println("NOPE");
            }
        }
    }


}
