package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        Map<Integer, Integer> map = new HashMap<>();
        bf.close();
        FileInputStream reader = new FileInputStream(file);
        while (reader.available() > 0) {
            int i = reader.read();
            if(map.containsKey(i)) {
                int count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }
        int max = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> i: map.entrySet()) {
            int count = i.getValue();
            if (max > count) {
                max = count;
                list.clear();
                list.add(i.getKey());
            } else if (max == count) {
                list.add(i.getKey());
            }
        }
        for(Integer i: list) {
            System.out.print(i + " ");
        }
        reader.close();
    }
}
