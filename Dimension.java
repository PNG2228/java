package com.pg;
public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // Convert the total inches into feet and inches
        this.feet = inches / 12;
        this.inches = inches % 12;
    }
    
    public int getFeet() {
        // Return the value of feet
        return feet;
    }
    
    public int getInches() {
        // Return the value of inches
        return inches;
    }    
}
