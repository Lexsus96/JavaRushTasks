package com.javarush.task.task08.task0809;

import java.util.*;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date date1 = new Date();
        insert10000(list);
        Date date2 = new Date();
        // напишите тут ваш код
        return date2.getTime() - date1.getTime();
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
