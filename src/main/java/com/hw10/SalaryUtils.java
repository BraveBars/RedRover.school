package com.hw10;

import com.hw8.Month;
import com.hw8.MonthUtils;

//Создать класс SalaryUtils, и в нем написать метод
// getTotalSalary(Employee[] employees, Month[] months),
// который подсчитает общую сумму к выплате на всех
// сотрудников — простых работников, менеджеров и директоров.
public class SalaryUtils {

    public static int getTotalSalary(Employee[] employees, Month[] months) {
        int totalSalary = 0;

        for (Employee e : employees) {
            totalSalary += e.getSalary(months);
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alex", 50),
                new Manager("Jack", 50, 10),
                new Director("Robert", 50, 10)
        };
        Month[] year = MonthUtils.YEAR;
        System.out.println(getTotalSalary(employees, year));
    }
}
