package oop;

import java.util.Scanner;

/**
 * Created by sqle on 8/10/17.
 */
public class CinemaSeating {
    public static void main(String[] args) {
        RegularCinema regularCinema = new RegularCinema();
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        regularCinema.setSeat(x , y);
        regularCinema.checkPrice(x, y);

    }
}
