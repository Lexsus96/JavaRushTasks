package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = arr.length - 1; i > -1 ; i--) {
            System.out.println(arr[i]);
        }
    }
}

