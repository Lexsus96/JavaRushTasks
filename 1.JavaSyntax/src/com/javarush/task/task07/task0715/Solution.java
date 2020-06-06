package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<>();
        s.add("мама");
        s.add("мыла");
        s.add("раму");
        s.add(1,"именно");
        s.add(3,"именно");
        s.add(5,"именно");
        for(String str : s) {
            System.out.println(str);
        }
    }
}
