package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader input = new BufferedReader(new FileReader(file1));
        BufferedWriter output = new BufferedWriter(new FileWriter(file2));
        while (input.ready()) {
            char x = (char) input.read();
            if ((char) x == '.') {
                output.write('!');
            } else {
                output.write(x);
            }
        }
        input.close();
        output.close();
    }
}
