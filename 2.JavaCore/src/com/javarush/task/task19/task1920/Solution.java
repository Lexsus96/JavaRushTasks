package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {
            String s = reader.readLine();
            String name = s.split(" ")[0];
            Double tmp = Double.parseDouble(s.split(" ")[1]);
            if(map.containsKey(name)) {
                map.put(name, map.get(name) + tmp);
            } else {
                map.put(name, tmp);
            }
        }
        ArrayList<Map.Entry<String, Double>> result = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String, Double>> comparator = new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                Double l1 = o1.getValue();
                Double l2 = o2.getValue();
                return l2.compareTo(l1);
            }
        };
        result.sort(comparator);
        TreeSet<String> set = new TreeSet<>();
        Double max = result.get(0).getValue();
        for(Map.Entry<String, Double> entry: result) {
            if (entry.getValue().compareTo(max) == 0) {
                set.add(entry.getKey());
            }
        }
        for(String s: set) {
            System.out.println(s);
        }
        reader.close();
    }
}
