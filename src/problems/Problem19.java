package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem19 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();
            Integer c = scanner.nextInt();
            Integer d = scanner.nextInt();
            double value = (a * d + b * c) / (b * d);
            System.out.println(value);
        }

    }
}
