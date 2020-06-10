package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] s = new ArrayList[2];
        s[0] = new ArrayList<String>(Arrays.asList("123", "124"));
        s[1] = new ArrayList<String>(Arrays.asList("123", "124"));
        return s;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}