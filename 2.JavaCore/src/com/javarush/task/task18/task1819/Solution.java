package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bf.readLine();
        String file2 = bf.readLine();
        bf.close();
        FileInputStream fileInputStream3 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);


        int len1 = fileInputStream3.available();
        byte[] buffer1 = new byte[len1];
        fileInputStream3.read(buffer1);

        int len = fileInputStream2.available();
        byte[] buffer2 = new byte[len];
        fileInputStream2.read(buffer2);
        FileOutputStream fileInputStream1 = new FileOutputStream(file1);
        byte[] bigbuff = new byte[buffer2.length  + buffer1.length];
        System.arraycopy(buffer2, 0, bigbuff, 0, buffer2.length);
        System.arraycopy(buffer1, 0, bigbuff, buffer2.length, buffer1.length);
        fileInputStream1.write(bigbuff);
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();

    }
}
