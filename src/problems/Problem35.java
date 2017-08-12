package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/10/17.
 */
public class Problem35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextInt();

        double sum = 0;
        double remainder;
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            remainder = input % 10;
            sum += remainder;
            input = (input - remainder) / 10;
            if (input <= 0) {
                System.out.println(sum);
                break;
            }
        }
    }


}
