package com.hw7;

//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
//Given a non-negative integer, 3 for example,
// return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.
public class Task6 {

    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(9));
        System.out.println(countingSheep(0));
    }
}
