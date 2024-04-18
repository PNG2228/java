package com.pg;
import java.util.Scanner;

public class PowerUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time value (HH:MM): ");
        String timeValue = scanner.next();

        int totalMilliamps = calculatePowerUsage(timeValue);

        System.out.println("Total milliamps required: " + totalMilliamps + " mA");

        // Close the scanner
        scanner.close();
    }

    static int calculatePowerUsage(String timeValue) {
        int totalMilliamps = 0;

        int hours = Integer.parseInt(timeValue.split(":")[0]);
        if (hours >= 10) {
            totalMilliamps += calculateSegmentPower(hours / 10);
        }
        totalMilliamps += calculateSegmentPower(hours % 10);

        totalMilliamps += 20;

        int minutes = Integer.parseInt(timeValue.split(":")[1]);
        totalMilliamps += calculateSegmentPower(minutes / 10);
        totalMilliamps += calculateSegmentPower(minutes % 10);

        return totalMilliamps;
    }

    static int calculateSegmentPower(int digit) {
        int[] segmentPower = { 0, 15, 30, 60, 45, 75, 105, 90, 120, 150 };
        return segmentPower[digit];
    }
}
