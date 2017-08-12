package problems;

import java.util.Scanner;

public class Problem16 {
        public static void main(String[] args) {
            System.out.println("Please input the xs and ys of the two points in space");
            Scanner scanner = new Scanner(System.in);
            Integer x1 = scanner.nextInt();
            Integer y1 = scanner.nextInt();
            Integer x2 = scanner.nextInt();
            Integer y2 = scanner.nextInt();
            Double length = java.lang.Math.sqrt((x1 - x2)*(x1-x2) + (y1-y2)*(y1-y2));
            System.out.println(length);

        }
    }


