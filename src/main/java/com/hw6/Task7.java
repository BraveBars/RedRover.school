package com.hw6;

//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.
public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int total = 0;
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                total += array[i][j];
//            }
//        }

        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Сумма элементов массива = " + total);
    }
}
