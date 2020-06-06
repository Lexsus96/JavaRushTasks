package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            int tmp = strings.get(i).length();
            if (tmp > max)
                max = tmp;
            if (tmp < min)
                min = tmp;
        }
        for (String s : strings) {
            if (s.length() == min || s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
