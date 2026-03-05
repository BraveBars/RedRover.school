package com.hw9.hw2;
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя
// с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        if (Character.toLowerCase(sex) == 'm') {
            return "Mr. " + name;
        } else if (Character.toLowerCase(sex) == 'f') {
            return "Mrs. " + name;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Anna", 24, 'f');
        Person person2 = new Person("Alex", 31, 'M');
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
