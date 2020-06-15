package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            Scanner scanner = new Scanner(System.in);
            String file = scanner.nextLine();
            scanner.close();
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.close();
            BufferedReader bf = new BufferedReader(new FileReader(file));
            ArrayList<Integer> list = new ArrayList<>();
            String s;
            while((s = bf.readLine()) != null) {
                int i = Integer.parseInt(s);
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
            bf.close();
            list.sort(Comparator.naturalOrder());
            for(int i: list) {
                System.out.println(i);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
