package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(s));
            while ((s = bf.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.write('\n');
                if (s.equals("exit")) {
                    break;
                }
            }
            bf.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
