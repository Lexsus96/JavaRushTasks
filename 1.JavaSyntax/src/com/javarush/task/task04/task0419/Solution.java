package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        System.out.println(Math.max(Math.max(s.nextInt(), s.nextInt()), Math.max(s.nextInt(), s.nextInt())));
    }
}
