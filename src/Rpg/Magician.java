package Rpg;

public class Magician extends Role {    
    public void fight() {
        System.out.println("Magic Attack");
    }

    public void fight(int mana_cost) {
        System.out.printf("Cast a magic in cost of %d mana \n", mana_cost);
    }
    
    public void cure() {
        System.out.println("Cure");
    }
} 