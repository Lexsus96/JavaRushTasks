package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        long count = 0;
        for(byte x: bytes) {
            char c = (char) x;
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
