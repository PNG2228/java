package com.pg;
public class Square {

    private int side;

    public Square(int side) {
        // Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // Calculate and return the area of the square
        return side * side;
    }

    public int calculatePerimeter() {
        // Calculate and return the perimeter of the square
        return 4 * side;
    }
}
