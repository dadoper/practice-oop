package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem17 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please input the xs and ys of the two points in space");
            Scanner scanner = new Scanner(System.in);
            Integer x1 = scanner.nextInt();
            Integer y1 = scanner.nextInt();
            Integer x2 = scanner.nextInt();
            Integer y2 = scanner.nextInt();
            double slope = (y1 - y2) / (x1 - x2);
            double xIntercept = y1 - slope * x1;
            Integer x3 = scanner.nextInt();
            Integer y3 = scanner.nextInt();
            if(y3 == x3*slope + xIntercept) {
                System.out.println("The three points are aligned");
            } else {
                System.out.println("The three points are not aligned");
            }
        }
    }
}
