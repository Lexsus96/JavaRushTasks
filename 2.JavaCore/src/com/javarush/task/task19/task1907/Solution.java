package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader(file));
        int count = 0;
        while(bufferedReader.ready()) {
            String s = bufferedReader.readLine();
            String[] arr = s.split("\\W");
            for (String k: arr) {
                if (k.equals("world")) {
                    count++;
                }
            }
        }
        bufferedReader.close();
        System.out.println(count);
    }
}
