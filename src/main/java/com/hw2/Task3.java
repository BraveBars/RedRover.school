package com.hw2;

public class Task3 {
    public static void main(String[] args) {
        int pirates = 25;
        int doubloons = 905;
        int ownerPart = doubloons / 2;
        int captainPart = (doubloons - ownerPart) / 2;
        int teamSalary = (doubloons - ownerPart - captainPart);
        int change = teamSalary % pirates;
        int teamSalaryForEach = teamSalary / pirates;
        int totalCaptainGet = captainPart + teamSalaryForEach;
        int jackSparrowTotal = totalCaptainGet + ownerPart;
        System.out.println("Владелец корабля получит - " + ownerPart + " дублонов");
        System.out.println("Капитан корабля получит - " + (totalCaptainGet) + " дублонов");
        System.out.println("Команда корабля получит - " + teamSalary +
                " дублонов, по " + teamSalaryForEach + " дублонов каждому");
        System.out.println("Если корабль принадлежит Джеку, то он получит - " + jackSparrowTotal);
        System.out.println("Остаток - " + change);
    }
}
