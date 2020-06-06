package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Integer i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }
        for (String s : strings) {
            if (s.length() == max) {
                System.out.println(s);
            }
        }
    }
}
