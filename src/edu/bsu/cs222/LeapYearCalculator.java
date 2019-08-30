package edu.bsu.cs222;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        if (year >= 1752) {
            if (year % 4 == 0) {
                if (year % 400 == 0) return true;
                if (year % 100 == 0) return false;
                return true;
            }
            return false;
        }
        else return false;
    }
}
