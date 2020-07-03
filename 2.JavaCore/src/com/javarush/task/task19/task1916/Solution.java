package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        ArrayList<String> f1 = new ArrayList<>();
        ArrayList<String> f2 = new ArrayList<>();
        reader = new BufferedReader(new FileReader(file1));
        while (reader.ready()) {
            f1.add(reader.readLine());
        }
        reader.close();
        reader = new BufferedReader(new FileReader(file2));
        while (reader.ready()) {
            f2.add(reader.readLine());
        }
        reader.close();
        int j = 0, i = 0;
        String s1, s2;
        for (; i < f1.size() && j < f2.size();) {
            s1 = f1.get(i);
            s2 = f2.get(j);
            if(s1.equals(s2)) {
                lines.add(new LineItem(Type.SAME, s1));
                j++;
                i++;
            } else {
                if (i + 1 < f1.size()) {
                    if (f1.get(i + 1).equals(s2)) {
                        lines.add(new LineItem(Type.REMOVED, s1));
                        i++;
                    } else {
                        lines.add(new LineItem(Type.ADDED, s2));
                        j++;
                    }
                } else if (j + 1 < f2.size()){
                    if (f2.get(j + 1).equals(s1)) {
                        lines.add(new LineItem(Type.ADDED, s2));
                        j++;
                    } else {
                        lines.add(new LineItem(Type.REMOVED, s1));
                        i++;
                    }
                }
            }
        }
        if (i < f1.size()) {
            lines.add(new LineItem(Type.REMOVED, f1.get(i)));
        }
        if (j < f2.size()) {
            lines.add(new LineItem(Type.ADDED, f2.get(j)));
        }
        /*for(LineItem item: lines) {
            System.out.println(item.type + " " + item.line);
        }*/
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
