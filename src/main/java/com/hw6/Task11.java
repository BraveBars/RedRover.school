package com.hw6;

import java.util.Arrays;

//Дан массив:
//int[] arr = {1, 2, 3, 4, 5};
//Необходимо “сдвинуть” этот массив влево на одну позицию так, чтобы получилось:
//{2, 3, 4, 5, 1}
public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int firstNum = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstNum;
        System.out.println(Arrays.toString(arr));
    }
}
