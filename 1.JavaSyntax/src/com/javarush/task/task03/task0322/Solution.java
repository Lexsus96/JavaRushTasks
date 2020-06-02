package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name1 = r.readLine();
        String name2 = r.readLine();
        String name3 = r.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}