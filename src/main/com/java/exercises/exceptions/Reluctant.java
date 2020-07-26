package main.com.java.exercises.exceptions;

public class Reluctant {
    /**
     * this example will throw StackOverflow error as you cannot instantiate a
     * field with same class type.
     */
    private Reluctant reluctantInstance = new Reluctant();

    public Reluctant() throws Exception {
        throw new Exception("I'm not coming out!");
    }

    public static void main(String... args) {
        try {
            Reluctant b = new Reluctant();
            System.out.println("Surprise");
        } catch (Exception e) {
            System.out.println("I Told you so!");
        }
    }
}
