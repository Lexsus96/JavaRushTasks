package com.javarush.task.task18.task1826;

/* 
Шифровка
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) {
        switch (args[0]) {
            case "-e":
                encode(args[1], args[2]);
                break;
            case "-d":
                decode(args[1], args[2]);
                break;
        }
    }
    public static void encode(String input, String output) {
        try {
            FileInputStream fileInputStream = new FileInputStream(input);
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            int len = fileInputStream.available();
            byte[] bytes = new byte[len];
            fileInputStream.read(bytes);
            bytes[0]++;
            fileOutputStream.write(bytes);
            fileInputStream.close();
            fileOutputStream.close();
        }catch (IOException e) {}

    }

    public static void decode(String input, String output) {
        try {
            FileInputStream fileInputStream = new FileInputStream(input);
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            int len = fileInputStream.available();
            byte[] bytes = new byte[len];
            fileInputStream.read(bytes);
            bytes[0]--;
            fileOutputStream.write(bytes);
            fileInputStream.close();
            fileOutputStream.close();
        }catch (IOException e) {}
    }

}
