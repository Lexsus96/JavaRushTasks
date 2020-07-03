package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileReader input = new FileReader(file1);
        FileWriter output = new FileWriter(file2);
        boolean isWrite = false;
        while (input.ready()) {
            byte x = (byte)input.read();
            if (isWrite) {
                output.write(x);
            }
            isWrite = !isWrite;
        }
        input.close();
        output.close();

    }
}
