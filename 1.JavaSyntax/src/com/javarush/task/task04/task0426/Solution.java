package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String z;
        String chet;
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("ноль");
        } else {
            if (n > 0) {
                z = "положительное";
            } else {
                z = "отрицательное";
            }
            if (n % 2 == 0) {
                chet = "четное";
            } else {
                chet = "нечетное";
            }
            System.out.printf("%s %s число", z, chet);
        }
    }
}
