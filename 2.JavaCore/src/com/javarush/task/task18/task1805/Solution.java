package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        Set<Integer> set = new HashSet<>();
        bf.close();
        FileInputStream reader = new FileInputStream(file);
        while (reader.available() > 0) {
            int i = reader.read();
            set.add(i);
        }
        int max = 0;
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(Integer i: list) {
            System.out.print(i + " ");
        }
        reader.close();
    }
}
