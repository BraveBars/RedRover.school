package com.hw11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test {
    @Test
    public void testAddPositive() {
        Assert.assertEquals(Task1.addUp(5, 3), 8);
    }

    @Test
    public void testAddNegative() {
        Assert.assertEquals(Task1.addUp(-5, -3), -8);
    }

    @Test
    public void testAddZero() {
        Assert.assertEquals(Task1.addUp(0, 0), 0);
    }


    @Test
    public void testSubPositive() {
        Assert.assertEquals(Task1.sub(9, 4), 5);
    }

    @Test
    public void testSubNegative() {
        Assert.assertEquals(Task1.sub(-5, -4), -1);
    }
    @Test
    public void testSubNegativeResult() {
        Assert.assertEquals(Task1.sub(10, 14), -4);
    }

    @Test
    public void testSubZero() {
        Assert.assertEquals(Task1.sub(0, 0), 0);
    }


    @Test
    public void testMultiplyPositive() {
        Assert.assertEquals(Task1.multiply(4,5), 20);
    }    @Test
    public void testMultiplyNegativeResult() {
        Assert.assertEquals(Task1.multiply(4, -5), -20);
    }    @Test
    public void testMultiplyNegative() {
        Assert.assertEquals(Task1.multiply(-5, -3), 15);
    }    @Test
    public void testMultiplyByZero() {
        Assert.assertEquals(Task1.multiply(10,0),0);
    }

    @Test
    public void testDividePositive() {
        Assert.assertEquals(Task1.divide(10, 5), 2.0);
    }
    @Test
    public void testDivideNegative() {
        Assert.assertEquals(Task1.divide(-10, -5), 2.0);
    }
    @Test
    public void testDivideNegativeResult() {
        Assert.assertEquals(Task1.divide(-10, 5), -2.0);
    }
    @Test
    public void testDivideByZero() {
        Assert.assertEquals(Task1.divide(10, 0), Double.POSITIVE_INFINITY);
    }
    @Test
    public void testDivideWithRemainder(){
        Assert.assertEquals(Task1.divide(10,3), 3.333, 0.001);
    }
}