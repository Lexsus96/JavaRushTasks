package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double avg = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        while (a != -1) {
            n++;
            avg += a;
            a = scanner.nextInt();
        }
        System.out.println(avg / n);
    }
}

