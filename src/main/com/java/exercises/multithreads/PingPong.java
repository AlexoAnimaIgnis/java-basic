package main.com.java.exercises.multithreads;

/**
 * solution to which thread class prints pingpong
 */
public class PingPong extends Thread {

    public void run() {
        System.out.println("ping");
    }

    public static void main(String... args) {
        Thread pingpong = new PingPong();
        pingpong.run();
        System.out.println("pong");
    }
}
