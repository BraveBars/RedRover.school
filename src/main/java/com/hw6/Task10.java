package com.hw6;
//Даны температуры воздуха за несколько дней:
//int[] temps = {18, 20, 17, 19, 16, 15, 21};
//Необходимо посчитать сколько раз за эти дни температура падала в сравнении с предыдущим днем.
public class Task10 {
    public static void main(String[] args) {
        int[] temps = {18, 20, 17, 19, 16, 15, 21};
        int counter = 0;
        for (int i = 1; i < temps.length; i++){
            if(temps[i] < temps[i - 1]){
                counter++;
            }
        }
        System.out.println("Сколько раз температура падала в сравнении с предыдущим днем? - " + counter);
    }
}
