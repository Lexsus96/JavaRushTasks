package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(s1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(s2));
        while ((line = fileReader.readLine()) != null) {
            fileWriter.write(line.replaceAll("\\p{Punct}", ""));
        }
        fileReader.close();
        fileWriter.close();
    }
}
