package com.pg;
public class LeapYearChecker1 {
    public boolean isLeapYear(int year) {
        if (year < 1) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
