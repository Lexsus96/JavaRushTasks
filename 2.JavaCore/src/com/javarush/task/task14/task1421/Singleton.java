package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        if (instance == null) {
            instance = new Singleton("new");
        }
    }
    private Singleton(String qu) {
        instance = this;
    }
    public static Singleton getInstance() {
        if (instance == null)
            new Singleton();
        return instance;
    }
}
