package com.hw6;
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.
public class Task8 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxNum = Integer.MIN_VALUE;
        for(int[] row: array){
            for (int value: row){
                if (value > maxNum){
                    maxNum = value;
                }
            }
        }
        System.out.println("Максимальное значение массива = " + maxNum);
    }
}
