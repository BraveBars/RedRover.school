package com.hw6;

//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести количество элементов в массиве.
public class Task9 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int counter = 0;
        for (int[] row : array) {
            counter += row.length;
        }
        System.out.println("Количество элементов в массиве = " + counter);
    }
}
