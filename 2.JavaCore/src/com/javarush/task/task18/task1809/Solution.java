package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bf.readLine();
            String file2 = bf.readLine();
            bf.close();
            FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream outputStream = new FileOutputStream(file1);
            int count = inputStream.available();
            Stack<Integer> stack = new Stack<>();
            while (inputStream.available() > 0) {
                stack.push(inputStream.read());
            }
            while (!stack.empty()) {
                outputStream.write(stack.pop());
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {

        }
    }
}
