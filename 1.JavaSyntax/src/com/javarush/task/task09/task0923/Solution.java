package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> soglas = new ArrayList<>();
        for (char x: s.toCharArray()){
            boolean c = false;
            for (char v: vowels) {
                if (v == x) {
                    c = true;
                    break;
                }
            }
            if (x == ' ' || x == '\n')
                continue;
            if (c) {
                glas.add(x);
            } else {
                soglas.add(x);
            }
        }
        for(Character x: glas) {
            System.out.print(x + " ");
        }
        System.out.println();
        for(Character x: soglas) {
            System.out.print(x + " ");
        }
        bufferedReader.close();
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}