package com.hw9.hw2;
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
//и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который
//возвращает true, если у сотрудника у которого был вызван метод и сотрудника который
//был передан как параметр, одинаковое имя.
public class Employee {
    private String name;
    private int age;
    private char sex;
    private int salary;

    public Employee(String name, int age, char sex, int salary){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.name.equals(employee.name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", 24, 'f', 2000);
        Employee employee2 = new Employee("Alex", 31, 'M', 3000);
        Employee employee3 = new Employee("Alex", 23, 'M', 1000);
        System.out.println(employee1.isSameName(employee1));
        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee2.isSameName(employee3));
    }
}
