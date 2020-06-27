package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
            GenerateThread t = new GenerateThread();
            System.out.println(t.toString());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread() {
            super(String.valueOf(++Solution.createdThreadCount));
            this.start();
        }
        @Override
        public void run() {
            GenerateThread g = null;
            if (Solution.createdThreadCount < Solution.count) {
                g = new GenerateThread();
                System.out.println(g);
            }
        }
        @Override
        public String toString() {
            return this.getName() + " created";
        }
    }
}
