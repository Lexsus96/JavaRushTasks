package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        for (Integer i = 0; i < 5; i++) {
            str.add(i.toString());
        }
        System.out.println(str.size());
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
