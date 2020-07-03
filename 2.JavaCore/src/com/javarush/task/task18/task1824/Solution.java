package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.nio.file.FileSystemException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            while (true) {
                input = bf.readLine();
                FileInputStream inputStream = new FileInputStream(input);
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(input);
        }
        bf.close();


    }
}
