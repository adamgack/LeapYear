package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2004IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }
    @Test
    public void test2001IsNotLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2001);
        Assert.assertFalse(result);
    }
    @Test
    public void test1996IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1996);
        Assert.assertTrue(result);
    }
    @Test
    public void test1900IsNotLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1900);
        Assert.assertFalse(result);
    }
    @Test
    public void test1752IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1752);
        Assert.assertTrue(result);
    }
    @Test
    public void test1748IsNotLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(1748);
        Assert.assertFalse(result);
    }
}
