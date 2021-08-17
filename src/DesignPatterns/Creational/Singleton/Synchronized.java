package DesignPatterns.Creational.Singleton;

public class Synchronized {
    private static Synchronized instance;

    private Synchronized() {
    }

    // Only one thread can execute this at a time
    public static synchronized Synchronized getInstance() {
        if (instance == null)
            instance = new Synchronized();
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
