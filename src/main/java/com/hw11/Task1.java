package com.hw11;

import org.apache.commons.lang3.StringUtils;

public class Task1 {
    public static int addUp(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        String s = StringUtils.abbreviate("Привет всем кто живет на луне!", 10);
        System.out.println(s);
    }
}
