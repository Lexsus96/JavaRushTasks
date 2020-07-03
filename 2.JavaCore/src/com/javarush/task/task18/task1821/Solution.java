package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int[] arr = new int[256];
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            arr[i]++;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                System.out.println((char) i + " " + arr[i]);
            }
        }
        fileInputStream.close();
    }
}
