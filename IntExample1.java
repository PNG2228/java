package com.pg;
import java.util.Scanner;

public class IntExample1 {
    public static void main(String[] args) {
        // Declare variables for player choices
        int player1, player2;

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt players to enter their choices
        System.out.print("Player 1, enter your choice (1 for paper, 2 for rock, 3 for scissors): ");
        player1 = scanner.nextInt();

        System.out.print("Player 2, enter your choice (1 for paper, 2 for rock, 3 for scissors): ");
        player2 = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Determine the winner based on the choices
        if (player1 == player2) {
            System.out.println("It's a tie!");
        } else if ((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 == 2)) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
