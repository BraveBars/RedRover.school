package com.hw10;

import com.hw8.Month;
import com.hw8.MonthUtils;

//Класс Manager должен иметь все то, что имеет Employee, и вдобавок,
//хранить число подчиненных. Метод getSalary(Month[] monthArray)
//должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.
public class Manager extends Employee {
    protected int teamSize;

    public Manager(String name, int salaryPerDay, int teamSize) {
        super(name, salaryPerDay);
        this.teamSize = teamSize;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int baseSalary = getBaseSalary(monthArray);
        return (int) (baseSalary * (1 + teamSize * 0.01));
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Alex", 50, 10);
        System.out.println(manager.getSalary(new Month[]{MonthUtils.APRIL}));
    }
}
