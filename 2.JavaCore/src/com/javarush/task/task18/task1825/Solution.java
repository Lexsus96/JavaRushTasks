package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = null;
            Map<Integer, String> map = new HashMap<>();
            int max = 0;
            while ((s = reader.readLine()) != null && !s.equals("end")) {
                int index = s.lastIndexOf(".part");
                int key = Integer.parseInt(s.substring(index + 5));
                if (key > max )
                    max = key;
                map.put(key, s);
            }
            reader.close();
            s = map.get(1);
            s = s.substring(0, s.lastIndexOf(".part"));
            FileOutputStream writer = new FileOutputStream(s, true);
            FileInputStream reader1 = null;
            for (int i = 1; i <= max; i++) {
                reader1 = new FileInputStream(map.get(i));
                int r = reader1.available();
                byte[] bytes = new byte[r];
                reader1.read(bytes);
                writer.write(bytes);
                reader1.close();
            }
            writer.close();
            reader.close();
            reader1.close();
        } catch (IOException e) {}
    }
}
