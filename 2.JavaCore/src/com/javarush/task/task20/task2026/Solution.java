package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int result = 0;
        if (a == null) return result;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    result++;
                    printRectangle(a, i, j);
                }
            }
        }
        return result;
    }
    public static void printRectangle(byte[][] a, int i, int j) {
        if (i < 0 || i >= a.length) return;
        if (j < 0 || j >= a[i].length) return;
        if (a[i][j] == 1) {
            a[i][j] = 0;
            printRectangle(a, i - 1, j);
            printRectangle(a, i  + 1, j);
            printRectangle(a, i , j - 1);
            printRectangle(a, i , j + 1);
        }
    }
}
