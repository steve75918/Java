public class DemoWrapperTrap {
    public static void main(String[] args) {
        Character a=new Character('a');
        Character bigA=new Character('A');
        Character a2=new Character('a');

        System.out.println("result a > A : " + (a > bigA));   

        // false bacause variable of object is an object reference
        System.out.println("result a == a2 : " + (a == a2));  

        // to compare objects, use .equals()
        System.out.println("result a == a2 by method equals: " + (a.equals(a2))); 
    }
}