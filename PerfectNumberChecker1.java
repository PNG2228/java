package com.pg;
public class PerfectNumberChecker1 {
    public boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 1; // Include 1 as a factor
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                sum += number / i; // Add the other factor
            }
        }

        return sum == number;
    }
}
