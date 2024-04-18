package com.pg;
import java.util.Scanner;

public class IntNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 1000): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 1000) {
            System.out.println("Please enter a number between 1 and 1000.");
        } else {
            System.out.println("Hailstone Series for " + number + ":");
            generateHailstoneSeries(number);
        }

        // Close the scanner
        scanner.close();
    }

    static void generateHailstoneSeries(int n) {
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }

        System.out.println(); 
    }
}

