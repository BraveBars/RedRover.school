package com.hw6;
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
public class Task6 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int total = 0;
        for (int j : array) {
            total += j;
        }
        System.out.println("Сумма всех значений массива = " + total);
    }
}
