package com.pg;
import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter points for Player 1's hand: ");
        int hand1 = scanner.nextInt();

        System.out.print("Enter points for Player 2's hand: ");
        int hand2 = scanner.nextInt();

        // Determine the winner or declare a tie
        if (hand1 > 21 && hand2 > 21) {
            System.out.println("Both players bust!");
        } else if (hand1 <= 21 && hand2 <= 21) {
            if (Math.abs(21 - hand1) < Math.abs(21 - hand2)) {
                System.out.println("Player 1 wins!");
            } else if (Math.abs(21 - hand1) > Math.abs(21 - hand2)) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("Tie!");
            }
        } else if (hand1 <= 21) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

        // Close the scanner
        scanner.close();
    }
}

