package com.hw8;

//Создать класс SalaryUtils, в котором будет статический метод
//calculateSalaryForOneMonth(Employee employee, Month month),
//который рассчитает зарплату для переданного сотрудника за указанный месяц.
//
//В том же классе создать статический метод
//calculateSalaryForManyMonths(Employee employee, Month[] months),
//который вычислит зарплату сотрудника за несколько месяцев.
public class SalaryUtils {
    public static int calculateSalaryForOneMonth(Employee employee, Month month) {
        return employee.getSalaryInDay() * month.getWorkDays();
    }

    public static int calculateSalaryForManyMonths(Employee employee, Month[] months) {
        int salary = 0;
        for (Month m : months) {
            salary += m.getWorkDays() * employee.getSalaryInDay();
        }
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 25, 'M', 50);
        System.out.println(calculateSalaryForOneMonth(employee, MonthUtils.APRIL));
        System.out.println(calculateSalaryForManyMonths(employee, MonthUtils.FIRST_QUARTER));
        System.out.println(calculateSalaryForManyMonths(employee, MonthUtils.SECOND_QUARTER));
        System.out.println(calculateSalaryForManyMonths(employee, MonthUtils.THIRD_QUARTER));
        System.out.println(calculateSalaryForManyMonths(employee, MonthUtils.FOURTH_QUARTER));
        System.out.println(calculateSalaryForManyMonths(employee, MonthUtils.YEAR));
    }
}
