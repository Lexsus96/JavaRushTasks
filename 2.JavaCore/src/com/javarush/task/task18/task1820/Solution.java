package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String output = bf.readLine();
        bf.close();
        bf = new BufferedReader(new FileReader(input));
        BufferedWriter out = new BufferedWriter(new FileWriter(output));
        while (bf.ready()) {
            String s = bf.readLine();
            String[] arr = s.split(" ");
            for (String i: arr) {
                double d = Double.parseDouble(i);
                out.write(String.format("%d ", (int)Math.round(d)));
            }
        }
        bf.close();
        out.close();
    }
}
