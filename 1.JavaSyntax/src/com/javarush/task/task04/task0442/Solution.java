package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i;
        int sum = -1;
        while ((i = scanner.nextInt()) != -1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
