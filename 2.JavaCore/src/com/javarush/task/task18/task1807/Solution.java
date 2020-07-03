package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();
            FileInputStream bf = new FileInputStream(file);
            int count = 0;
            while (bf.available() > 0) {
                    char x = (char) bf.read();
                    if (x == ',') {
                        count++;
                    }
            }
            bf.close();
            System.out.println(count);
        } catch (IOException e) {}
    }
}
