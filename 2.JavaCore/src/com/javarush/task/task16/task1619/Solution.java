package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.setInterrupted(true);
    }

    public static class TestThread implements Runnable {
        private static volatile boolean isInterrupted = false;
        public static void setInterrupted(boolean b) {
            TestThread.isInterrupted = b;
        }
        public void run() {
            while (!isInterrupted) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
