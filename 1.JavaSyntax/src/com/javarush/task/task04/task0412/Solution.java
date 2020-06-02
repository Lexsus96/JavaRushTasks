package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0) {
            System.out.println(n);
        } else if (n > 0) {
            n *= 2;
            System.out.println(n);
        } else {
            n++;
            System.out.println(n);
        }
    }

}