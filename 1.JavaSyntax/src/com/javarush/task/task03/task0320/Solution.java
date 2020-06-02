package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream s = System.in;
        Reader r = new InputStreamReader(s);
        BufferedReader bf = new BufferedReader(r);
        String name = bf.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
