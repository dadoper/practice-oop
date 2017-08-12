package problems;

import java.util.Scanner;

/**
 * Created by sqle on 8/9/17.
 */
public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Integer input = scanner.nextInt();
            boolean checkSquare = false;
            for(int i = 1; i <= Math.sqrt(input); ++i) {
                if((input/i) == i) {
                    checkSquare = true;
                }
            }
            if(checkSquare == true) {
                System.out.println("YUP");
            } else {
                System.out.println("NOPE");
            }
        }
    }
}