package Rpg;

public class RPG {
    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        System.out.println("Demo Polymorphism");
        swordsMan.fight();
        magician.fight();

        System.out.println("");

        System.out.println("Demo Overload");
        magician.fight();
        magician.fight(100);
    }
}