package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/10/17.
 */
public class Problem40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextInt();

        double number = 0;
        double largest = 0;
        double remainder;
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            remainder = input % 10;
            input = (input - remainder) / 10;
            if(largest <= remainder) {
                largest = remainder;
                number ++;
            }
            if (input <= 0) {
                System.out.println(number);
                break;
            }
        }
    }
}
