package main.com.java.exercises.oop;

public class OverloadingA {

    public int getNumber(int a) {
        return a;
    }

    private int getNumber(int a, int b) {
        return a + b;
    }

    public void getNumber(int a, int b, int c) throws Exception {

    }
}
