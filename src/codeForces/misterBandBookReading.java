package codeForces;

import java.util.Scanner;

/**
 * Created by sqle on 8/11/17.
 */
public class misterBandBookReading {
    public static void main(String[] args) {
        //http://codeforces.com/problemset/problem/820/A
        //TODO: get user's input: c pages, vo pages per day, v1 max pages per day, a pages increment, , reread l pages
        Scanner scanner = new Scanner(System.in);
        Integer c = scanner.nextInt();
        Integer vo = scanner.nextInt();
        Integer v1 = scanner.nextInt();
        Integer a = scanner.nextInt();
        Integer l = scanner.nextInt();
        Integer day = 0;
        Integer done = 0;
        Integer speed = vo;
        long initial = System.currentTimeMillis();
        for(int i = 0; i < Integer.MAX_VALUE; ++i) {
            if((vo + a*i) >= v1) {
                speed = v1;
            }
            if()
        }
        long end = System.currentTimeMillis();
        System.out.println(end-initial);

    }
}
