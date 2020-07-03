package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream writer = new FileOutputStream(reader.readLine());
        reader.close();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream s = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(s);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);
        System.out.println(s.toString());
        writer.write(s.toByteArray());
        writer.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

