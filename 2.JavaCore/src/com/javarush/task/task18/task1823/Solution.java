package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<ReadThread> list = new ArrayList<>();
        while((s = reader.readLine()) != null && !s.equals("exit")){
            ReadThread r = new ReadThread(s);
            r.start();
            list.add(r);
        }
        for(ReadThread r: list) {
            r.join();
        }

    }

    public static class ReadThread extends Thread {
        String filename;
        public ReadThread(String fileName) {
            this.filename = fileName;
            //implement constructor body
        }
        @Override
        public void run() {
                try {
                    int maxByte = 0;
                    Map<Integer, Integer> map = new HashMap<>();
                    FileInputStream reader = new FileInputStream(filename);
                    while (reader.available() > 0) {
                        int i = reader.read();
                        if(map.containsKey(i)) {
                            int count = map.get(i);
                            map.put(i, count + 1);
                        } else {
                            map.put(i, 1);
                        }
                    }
                    int max = 0;
                    List<Integer> list = new ArrayList<>();
                    for(Map.Entry<Integer, Integer> i: map.entrySet()) {
                        int count = i.getValue();
                        if (max < count) {
                            max = count;
                            list.clear();
                            list.add(i.getKey());
                        } else if (max == count) {
                            list.add(i.getKey());
                        }
                    }
                    synchronized (Solution.class) {
                        resultMap.put(filename, list.get(0));
                    }
                    reader.close();
                } catch (IOException e) {}
            }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
