package com.javarush.task.task08.task0823;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Омовение Рамы
*/

public class Solution {
    public static void main(java.lang.String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String string = reader.readLine();
        java.lang.String[] tmp = string.split(" ");
        for(java.lang.String a: tmp) {
            if (a.length() > 0) {
                char c = a.charAt(0);
                System.out.print(Character.toUpperCase(c));
                for (int i = 1; i < a.length(); i++) {
                    System.out.print(a.charAt(i));
                }
            }
            System.out.print(" ");
        }
        //напишите тут ваш код
    }
}
