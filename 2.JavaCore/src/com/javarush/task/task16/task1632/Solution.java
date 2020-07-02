package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread(() -> {
            Thread t = Thread.currentThread();
            while (true) {
                if(t.isInterrupted()){
                    System.out.println("InterruptedException");
                }
            }
        }));
        threads.add(new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }));
        threads.add(new Thread4());
        threads.add(new Thread(() -> {
            try {
                String s;
                int sum = 0;
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while(((s = reader.readLine()) != null) && (!s.equals("N"))) {
                    Integer i = Integer.parseInt(s);
                    sum += i;
                }
                System.out.println(sum);
            } catch (NumberFormatException | IOException e) {

            }
        }));
    }
    public static void main(String[] args) {

    }
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true);
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true);
        }
    }
    public static class Thread4 extends Thread implements Message {
        static boolean isAlive = true;
        public void showWarning() {
            isAlive = false;
        }
        @Override
        public void run() {
            while(isAlive);
        }
    }
}