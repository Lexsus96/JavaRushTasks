package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while (reader.ready()) {
            s = reader.readLine();
            String name = s.split(" ")[0];
            Double tmp = Double.parseDouble(s.split(" ")[1]);
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + tmp);
            } else {
                map.put(name, tmp);
            }
        }
        map.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        reader.close();
    }
}
