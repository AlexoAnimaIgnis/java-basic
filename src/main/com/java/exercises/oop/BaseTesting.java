package main.com.java.exercises.oop;

public class BaseTesting {
    public static void main(String... args) {
        Derived derived = new DeriDerived();
        Cache cache = new Cache();
        System.out.println(cache.getSum());

        Dog wooper = new Dog();
        Dog nipper = new Basenji();
        wooper.bark();
        nipper.bark();
    }

}
