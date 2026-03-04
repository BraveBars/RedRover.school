package com.hw8;
//Создать класс Month с полями: имя месяца,
// количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные
// месяцы или их массивы для использования (объекты класса Month).
public class Month {
    private String monthName;
    private int days;
    private int workDays;

    public Month(String monthName, int days, int workDays) {
        this.monthName = monthName;
        this.days = days;
        this.workDays = workDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}
