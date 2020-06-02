package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.util.Scanner;

public class Solution {
    static int max (int a, int b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = max(max(a,b), max(b,c));
        if ((max == a && max < b + c) || (max == b && max < a + c) || (max == c && max < a + b)) {
            System.out.println("Треугольник существует.");
        }else {
            System.out.println("Треугольник не существует.");
        }

    }
}