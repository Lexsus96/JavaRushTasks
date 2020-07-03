package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(s));
        while (reader.ready()) {
            System.out.println(new StringBuilder(reader.readLine()).reverse().toString());
        }
        reader.close();
    }
}
