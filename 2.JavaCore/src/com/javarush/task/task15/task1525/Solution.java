package com.javarush.task.task15.task1525;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (bf.ready()) {
                lines.add(bf.readLine());
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e.getClass());
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
