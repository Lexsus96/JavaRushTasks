package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        double t = s.nextDouble();
        t %= 5;
        if (t >= 4) {
            System.out.println("красный");
        } else if (t >= 3){
            System.out.println("желтый");
        } else {
            System.out.println("зеленый");
        }
    }
}