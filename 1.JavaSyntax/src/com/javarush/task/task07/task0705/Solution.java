package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] small = new int[10];
        int[] big = new int[10];
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(arr,0,small,0,10);
        System.arraycopy(arr,10, big,0,10);
        for (int i : big)
            System.out.println(i);
    }
}
