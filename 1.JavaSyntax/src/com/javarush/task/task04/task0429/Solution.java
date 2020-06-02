package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 3; i++) {
            int k;
            if ((k = scanner.nextInt()) > 0)
                count++;
            else if (k < 0){
                count1++;
            }
        }
        System.out.println("количество отрицательных чисел: " + count1);
        System.out.println("количество положительных чисел: " + count);
    }
}
