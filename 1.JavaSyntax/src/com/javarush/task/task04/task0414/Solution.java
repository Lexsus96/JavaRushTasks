package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (n % 100 == 0) {
            System.out.println("количество дней в году: 365");
        } else if (n % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}