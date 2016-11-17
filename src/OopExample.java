class Parent {
    public void do() {
        System.out.println("This is parent.");
    }
}

class Child1 extends Parent {
    @Override
    public void do() {
        System.out.println("This is Child1.");
    }
}

class Child2 extends Parent {
    @Override
    public void do() {
        System.out.println("This is Child2.");
    }
}

public class OopExemple {
    public static void main(String[] args) {

    }
}