package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bf.readLine();
        String file2 = bf.readLine();
        String file3 = bf.readLine();
        bf.close();
        FileOutputStream fileInputStream1 = new FileOutputStream(file1, true);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);
        int len = fileInputStream2.available();
        byte[] arr = new byte[len];
        fileInputStream2.read(arr);
        fileInputStream1.write(arr);
        byte[] arr2 = new byte[fileInputStream3.available()];
        fileInputStream3.read(arr2);
        fileInputStream1.write(arr2);
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
