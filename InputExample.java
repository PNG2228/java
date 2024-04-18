package com.pg;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Display the menu to the user
        System.out.println("Choose an operation:");
        System.out.println("1 – addition (+)");
        System.out.println("2 – subtraction (-)");
        System.out.println("3 – multiplication (*)");
        System.out.println("4 – division (/)");
        System.out.println("5 – modulus (%)");

        // Prompt the user to select their desired operation
        System.out.print("Enter the number of your desired operation above >>> ");
        int operation = scanner.nextInt();

        // Prompt the user to enter the first number
        System.out.print("Enter the first number >>> ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number >>> ");
        double num2 = scanner.nextDouble();

        // Perform the selected operation and display the result
        switch (operation) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                // Check if the second number is not zero to avoid division by zero
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                // Check if the second number is not zero to avoid modulus by zero
                if (num2 != 0) {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}