package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] a = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n > 0  && n < 8) {
            System.out.println(a[n - 1]);
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}