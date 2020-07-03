package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        bf.close();
        int max = Integer.MAX_VALUE;
        FileInputStream reader = new FileInputStream(file);
        while (reader.available() > 0) {
            int i = reader.read();
            if (max > i) {
                max = i;
            }
        }
        System.out.println(max);
        reader.close();
    }
}
