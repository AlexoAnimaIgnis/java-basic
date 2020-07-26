package main.com.java.exercises.oop;

public class MyClassA {

    int inheritedFiled = 10;
    protected int x = 10;

    {
        System.out.println("Class A static block");
    }

    public MyClassA() {
        System.out.println("This is constructor A");
    }

    public int getInheritedFiled() {
        return inheritedFiled;
    }

    public void print() {
        System.out.println(x);
    }
}
