package com.hw9.task1;

//Create a function that returns the name of the winner in a fight between two fighters.
//
//Each fighter takes turns attacking the other and whoever kills the other first is victorious.
//Death is defined as having health <= 0.
//
//Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
//You can mutate the Fighter objects.
//
//Your function also receives a third argument, a string, with the name of the fighter that attacks first.
//
//Example:
//  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
//
//  Lew attacks Harry; Harry now has 3 health.
//  Harry attacks Lew; Lew now has 6 health.
//  Lew attacks Harry; Harry now has 1 health.
//  Harry attacks Lew; Lew now has 2 health.
//  Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
//
//public class Fighter {
//  public String name;
//  public int health, damagePerAttack;
//  public Fighter(String name, int health, int damagePerAttack) {
//    this.name = name;
//    this.health = health;
//    this.damagePerAttack = damagePerAttack;
//  }
//}
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1;
        Fighter b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) {
                return a.name;
            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                return b.name;
            }
        }
    }
//    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//        Fighter a = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
//        Fighter b = a == fighter1 ? fighter2 : fighter1;
//        while (true) {
//            b.health -= a.damagePerAttack;
//            System.out.printf("%s attacks %s; %s now has %d health.\n",
//                    a.name, b.name, b.name, b.health);
//            if (b.health <= 0) {
//                return a.name;
//            }
//
//            Fighter temp = a;
//            a = b;
//            b = temp;
//        }
//    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Alex", 100, 9);
        Fighter fighter2 = new Fighter("Jack", 140, 7);
        System.out.println(declareWinner(fighter1, fighter2, "Alex"));
    }
}
