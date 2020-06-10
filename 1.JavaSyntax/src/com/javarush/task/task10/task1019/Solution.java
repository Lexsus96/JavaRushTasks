package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        HashMap<String, Integer> map = new HashMap<>();
        while ((s = reader.readLine()) != null && !s.isEmpty()) {
            int id = Integer.parseInt(s);
            map.put(reader.readLine(), id);
        }
        for (Map.Entry<String, Integer> k: map.entrySet()) {
            System.out.printf("%d %s\n", k.getValue(), k.getKey());
        }
    }
}
