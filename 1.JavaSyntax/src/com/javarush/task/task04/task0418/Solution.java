package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        System.out.println(Math.min(s.nextInt(), s.nextInt()));
    }
}