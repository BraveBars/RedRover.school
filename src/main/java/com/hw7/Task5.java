package com.hw7;

import java.util.Arrays;

//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//Given an array of integers your solution should find the smallest integer.
//For example:
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.
public class Task5 {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78, 56, -2, 12, -8}));
        System.out.println(findSmallestInt(new int[]{Integer.MIN_VALUE, -666}));
    }
}
