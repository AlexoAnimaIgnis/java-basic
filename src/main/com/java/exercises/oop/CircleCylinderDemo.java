package main.com.java.exercises.oop;

public class CircleCylinderDemo {
    public static void main(String... args) {
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1.getRadius());

        /**
         * example of downcasting but this will throw a runtime error
         */
        //Cylinder cy1 = (Cylinder) new Circle(1);
        String s1 = "Alexo";
        String s2 = "Alexo";

        System.out.println(s1.equals(s2));

    }
}
