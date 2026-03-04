package com.hw2;

public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int c = a;
        a = b;
        b = c;
        System.out.println("Замена местами a и b, было: a = 25, b = 15, стало: a = " + a  + ", b =  " + b);
    }
}
