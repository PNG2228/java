package com.pg;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guesses = 7; 
        int numberToGuess = random.nextInt(100) + 1; 
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (guesses > 0) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number. You win!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            guesses--;

            if (guesses > 0) {
                System.out.println("Remaining guesses: " + guesses);
            } else {
                System.out.println("Sorry, you ran out of guesses. The correct number was: " + numberToGuess);
            }
        }
        scanner.close();
    }
}
