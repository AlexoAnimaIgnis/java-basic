package test.com.java.exercises.oop;

import main.com.java.exercises.oop.MyClassA;
import main.com.java.exercises.oop.MyClassB;
import org.junit.Test;

public class ConstructorTest {

    @Test
    public void printConstructors() {
        MyClassB b = new MyClassB();
    }

    @Test
    public void printConstructorA() {
        MyClassA a = new MyClassB();
    }

    @Test
    public void printInheritedField() {
        MyClassA a = new MyClassB();
        System.out.println(a.getInheritedFiled());
    }
}
