package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream s = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(s);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        boolean flag = false;
        for(String tmp: s.toString().split("\n")) {
            System.out.println(tmp);
            if (flag) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
            flag = !flag;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
