package com.hw4;
//Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//        Реализовать 2 варианта:
//использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//без использования конструкции if (шаг цикла на ваше усмотрение).
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Вариант с if:");
        for (int i = 40; i <=60; i++){
            if (i % 4 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\nВариант без if:");
        for (int i = 40; i <=60; i += 4){
            System.out.print(i + " ");
        }
    }
}
