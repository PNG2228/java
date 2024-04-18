package com.pg;
import java.util.Scanner;

public class IntNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer >>> ");
        int num = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= num) {
            if (i % 8 == 0 || i % 13 == 0) {
                sum += i;
            }
            i++;
        }

        // Print the sum of multiples of 8 or 13
        System.out.println("Sum of all multiples of 8 or 13 from 1 to " + num + " >>> " + sum);

        // Close the scanner
        scanner.close();
    }
}
