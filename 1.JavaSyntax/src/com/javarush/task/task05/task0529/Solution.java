package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        int sum = 0;
        while (!text.equals("сумма")) {
            sum += Integer.parseInt(text);
            text = bufferedReader.readLine();
        }
        System.out.println(sum);
    }
}
