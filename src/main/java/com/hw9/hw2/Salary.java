package com.hw9.hw2;

//Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
//метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
//аргумента вызова метода.
public class Salary {

    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (Employee emp : employeeArray) {
            sum += emp.getSalary();
        }
        return sum;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Anna", 24, 'f', 2000);
        Employee employee2 = new Employee("Alex", 31, 'M', 3000);
        Employee employee3 = new Employee("Alex", 23, 'M', 1000);

        System.out.println(getSum(new Employee[]{employee1, employee2, employee3}));
    }
}
