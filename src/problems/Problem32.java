package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem32 {
    public static void main(String[] args) {
        // Find the largest common factor
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer input = scanner.nextInt();
            Integer input2 = scanner.nextInt();
            Integer bigger;
            Integer smaller;
            if (input < input2) {
                bigger = input2;
                smaller = input;
                System.out.println(findFactor(bigger, smaller));

            } else if (input > input2) {
                bigger = input;
                smaller = input2;
                System.out.println(findFactor(bigger, smaller));
            } else {
                System.out.printf("The bigger common factor is %d", input);
            }
        }
    }

    public static Integer findFactor(Integer bigger, Integer smaller) {
        Integer factor = 1;
        Integer remainderS;
        Integer remainderB;
        for (int i = 1; i <= smaller; ++i) {
            remainderS = smaller % i;
            if (remainderS == 0) {
                smaller /= i;
                remainderB = bigger % i;
                if (remainderB == 0) {
                    bigger /= i;
                    factor *= i;
                }
            }
        }
        return factor;
    }
}
