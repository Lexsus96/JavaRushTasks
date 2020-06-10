package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int x;
        private int y;
        private boolean b;
        private String name;
        private double d;
        private char c;

        public Human(String name, double d, char c) {
            this.name = name;
            this.d = d;
            this.c = c;
        }

        public Human(double d, char c) {
            this.d = d;
            this.c = c;
        }

        public Human(int y, boolean b, String name) {
            this.y = y;
            this.b = b;
            this.name = name;
        }

        public Human(int y, boolean b) {
            this.y = y;
            this.b = b;
        }

        public Human(int x, int y, boolean b, String name, double d) {
            this.x = x;
            this.y = y;
            this.b = b;
            this.name = name;
            this.d = d;
        }

        public Human(int x, int y, boolean b, String name) {
            this.x = x;
            this.y = y;
            this.b = b;
            this.name = name;
        }

        public Human(int x, int y, boolean b) {
            this.x = x;
            this.y = y;
            this.b = b;
        }

        public Human(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Human(int x) {
            this.x = x;
        }

        public Human(int x, int y, boolean b, String name, double d, char c) {
            this.x = x;
            this.y = y;
            this.b = b;
            this.name = name;
            this.d = d;
            this.c = c;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
