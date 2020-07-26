package main.com.java.exercises.oop;

public class MyClassB extends MyClassA {

    private static int inheritedFiled;

    {
        System.out.println("Class B static block");
    }

    public MyClassB() {
        System.out.println("This is constructor B");
    }

    public int getInheritedFiled() {
        inheritedFiled += 10;
        return inheritedFiled;
    }

    public static void add(MyClassA a) {
        a.x = a.x + 10;
    }

}
