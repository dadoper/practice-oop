package oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sqle on 8/10/17.
 */

public class RegularCinema {
    private Integer row;
    private Integer column;
    private boolean availability;
    private double price = 50000;
    // Memory for booked seats
    private boolean[][] space = new boolean[row][column];

    public void openSpace() {
        for(int r = 0; r < column; ++r) {
            for(int c = 0; c < row; ++c) {
                space[r][c] = false;
            }
        }

    }

    // Setting standards value for space
    public RegularCinema(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public RegularCinema(Integer row) {
        this(row, 20);
    }

    public RegularCinema() {
        this(20, 20);
    }

    public void setSeat(Integer rowY, Integer columnX) {
        if(space[rowY-1][columnX-1] != false) {
            space[rowY-1][columnX-1] = true;
            System.out.println("Thank you for your selection.");
        } else {
            System.out.println("Please reselect your seating.");
        }
    }

    public double checkPrice(Integer x, Integer y) {
        if(row%2 == 1) {
            price -= 2000*Math.abs(row/2 + 1 - y);
        } else {
            if(y <= row/2) {
                price -= 2000*(row/2 - y);
            } else if((y > row/2) && (y <= row)) {
                price -= 2000*(y - row/2 - 1);
            }
        }
        return price;
    }
}
