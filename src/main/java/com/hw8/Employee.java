package com.hw8;
//Создать класс Employee с полями: имя, возраст, пол и ЗП в день.
public class Employee {
    private String name;
    private int age;
    private char sex;
    private int salaryInDay;

    public Employee(String name, int age, char sex, int salaryInDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryInDay = salaryInDay;
    }

    public String getName() {
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

    public int getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(int salaryInDay) {
        this.salaryInDay = salaryInDay;
    }
}
