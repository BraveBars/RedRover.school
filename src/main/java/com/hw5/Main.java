package com.hw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("Дан массив: {9, 2, 6, 4, 5, 12, 7, 8, 6}");

        System.out.print("Нечётные числа в массиве: ");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nЗначения массива больше 5: ");
        for (int i : array) {
            if (i > 5) {
                System.out.print(i + " ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }
        System.out.print("\nУвеличенные значения массива на 15: " + Arrays.toString(array));
    }
}
