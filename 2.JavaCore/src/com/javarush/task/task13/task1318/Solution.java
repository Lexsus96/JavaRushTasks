package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = bf.readLine();
            bf.close();
            FileInputStream f = new FileInputStream(s);
            while (f.available() > 0) {
                int i = f.read();
                System.out.write(i);
            }
            f.close();
            bf.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}