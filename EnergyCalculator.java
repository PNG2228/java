package com.pg;
import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the clock time (HH:MM): ");
        String time = scanner.nextLine();

        int totalEnergy = calculateEnergy(time);

        System.out.println("Energy used: " + totalEnergy + " milliamps");

        // Close the scanner
        scanner.close();
    }

    static int calculateEnergy(String time) {
        int totalEnergy = 0;

        for (char ch : time.toCharArray()) {
            switch (ch) {
                case '0':
                    totalEnergy += 0;
                    break;
                case '1':
                    totalEnergy += 20; 
                    break;
                case '2':
                    totalEnergy += 50;
                    break;
                case '3':
                    totalEnergy += 50; 
                    break;
                case '4':
                    totalEnergy += 40;
                    break;
                case '5':
                    totalEnergy += 50; 
                    break;
                case '6':
                    totalEnergy += 60;
                    break;
                case '7':
                    totalEnergy += 30; 
                    break;
                case '8':
                    totalEnergy += 70; 
                    break;
                case '9':
                    totalEnergy += 60; 
                    break;
                case ':':
                    totalEnergy += 20; 
                    break;
                default:
                   
                    System.out.println("Invalid character: " + ch);
                    break;
            }
        }

        return totalEnergy;
    }
}
