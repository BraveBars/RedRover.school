package com.hw10;

import com.hw8.Month;
import com.hw8.MonthUtils;

//Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
//Имя и ЗП должны быть обязательными, остальные поля — нет.
//Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
//за те месяцы которые были переданы в качестве аргумента.
public class Employee {

    protected String name;
    protected int age;
    protected char sex;
    protected int salaryPerDay;

    public Employee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public int getBaseSalary(Month[] monthArray) {
        int total = 0;
        for (Month m : monthArray) {
            total += m.getWorkDays() * salaryPerDay;
        }
        return total;
    }

    public int getSalary(Month[] monthArray) {
        return getBaseSalary(monthArray);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Alex", 50);
        System.out.println("Зарплата за первый квартал: " + employee.getSalary(MonthUtils.FIRST_QUARTER));
        System.out.println("Зарплата за второй квартал: " + employee.getSalary(MonthUtils.SECOND_QUARTER));
        System.out.println("Зарплата за третий квартал: " + employee.getSalary(MonthUtils.THIRD_QUARTER));
        System.out.println("Зарплата за четвёртый квартал: " + employee.getSalary(MonthUtils.FOURTH_QUARTER));
        System.out.println("Зарплата за год: " + employee.getSalary(MonthUtils.YEAR));
    }
}
