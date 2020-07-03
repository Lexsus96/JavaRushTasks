package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file1 = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
        while(reader.ready()) {
            String s = reader.readLine();
            String[] arr = s.split(" ");
            for (String k: arr) {
                if(k.matches("\\d*")) {
                    writer.write(k + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
