package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String s = reader.readLine();
            for (String value : s.split(" ")) {
                if (value.length() > 6) {
                    list.add(value);
                }
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            writer.write(list.get(i) + ",");
        }
        writer.write(list.get(list.size() - 1));
        reader.close();
        writer.close();
    }
}
