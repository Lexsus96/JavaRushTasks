package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf = new BufferedReader((new FileReader(reader.readLine())));
        reader.close();
        String s = null;
        while((s = bf.readLine()) != null && !s.split(" ")[0].equals(args[0]));
        if (s != null) {
            System.out.println(s);
        }
        bf.close();
    }
}
