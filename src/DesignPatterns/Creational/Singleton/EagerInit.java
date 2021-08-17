package DesignPatterns.Creational.Singleton;

public class EagerInit {
    private static EagerInit instance = new EagerInit();

    private EagerInit() {
    }

    public static EagerInit getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
