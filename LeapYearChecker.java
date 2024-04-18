package com.pg;
public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if (year < 1) {
            return false;
        }

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}
