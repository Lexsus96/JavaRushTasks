package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        while (bf.ready()) {
            String s = bf.readLine();
            int count = 0;
            for(String tmp: s.split(" ")) {
                if (words.contains(tmp)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
        }
        bf.close();
    }
}
