package main.com.java.exercises.oop;

public class OverridingB extends OverridingA{
    @Override
    public int getNumber(int a) {
        return super.getNumber(a);
    }

    @Override
    public void shouldThrowException() {
    }
}
