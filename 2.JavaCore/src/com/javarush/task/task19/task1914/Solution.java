package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream s = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(s);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);
        String[] str = s.toString().split(" ");
        int i1 = Integer.parseInt(str[0]);
        int i2 = Integer.parseInt(str[2]);
        int result = 0;
        if (str[1]. equals("+")) {
            result = i1 + i2;
        } else if (str[1].equals("*")) {
            result = i1 * i2;
        } else {
            result = i1 - i2;
        }
        System.out.println(s.toString() + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

