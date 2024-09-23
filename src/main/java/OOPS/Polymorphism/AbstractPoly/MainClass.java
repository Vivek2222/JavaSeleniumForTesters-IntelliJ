package OOPS.Polymorphism.AbstractPoly;

public class MainClass {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.walk();
        d1.eat();
        d1.bark();

        Cat c1 = new Cat();
        c1.walk();
        c1.meow();
        c1.eat();

        Animal a1 = new Dog();
        a1.walk();
        Animal a2 = new Cat();
        a2.walk();
    }
}
