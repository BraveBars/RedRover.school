package com.hw10;

import com.hw8.Month;
import com.hw8.MonthUtils;

//Класс Director должен вести себя как Manager,
//но давать надбавку к зарплате в 3% за каждого подчиненного.
public class Director extends Manager {
    public Director(String name, int salaryPerDay, int teamSize) {
        super(name, salaryPerDay, teamSize);
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int baseSalary = getBaseSalary(monthArray);
        return (int)(baseSalary * (1 + teamSize * 0.03));
    }

    public static void main(String[] args) {
        Director director = new Director("Alex", 50, 10);
        Manager manager = new Manager("Jack", 50, 10);
        Employee employee = new Employee("Robert", 50);
        System.out.println(employee.getSalary(new Month[]{MonthUtils.APRIL}));
        System.out.println(manager.getSalary(new Month[]{MonthUtils.APRIL}));
        System.out.println(director.getSalary(new Month[]{MonthUtils.APRIL}));
    }
}
