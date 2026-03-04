package com.hw6;
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.
public class Task5 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'е'){
                counter++;
            }
        }
        System.out.println("количество букв е: " + counter);
    }
}
