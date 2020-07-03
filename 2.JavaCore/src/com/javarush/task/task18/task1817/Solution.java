package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] bytes = new byte[fileInputStream.available()];
        long prob = 0, another = 0;
        fileInputStream.read(bytes);
        fileInputStream.close();
        for(byte x: bytes) {
            if ((char) x == ' ') {
                prob++;
            }
            another++;
        }
        System.out.printf("%.2f", (double) prob / (double) another * 100);

    }
}
