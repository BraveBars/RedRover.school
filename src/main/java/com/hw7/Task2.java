package com.hw7;

//https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//Code as fast as you can! You need to double the integer and return it.
public class Task2 {
    public static int doubleInteger(int i) {
        i *= 2;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(doubleInteger(15));
    }
}
