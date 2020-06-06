package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add( reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = strings.remove(4);
            strings.add(0, s);
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
