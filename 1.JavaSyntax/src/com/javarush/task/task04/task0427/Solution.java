package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String z;
        String chet;
        int n = scanner.nextInt();
        if (n > 0 && n < 1000) {
            if (n % 2 == 0) {
                chet = "четное";
            } else {
                chet = "нечетное";
            }
            if (n / 10 == 0) {
                z = "однозначное";
            } else if (n / 100 == 0) {
                z = "двузначное";
            } else {
                z = "трехзначное";
            }
            System.out.printf("%s %s число", chet, z);
        }

    }
}
