package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int tmp = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
            if (i == 0) {
                tmp = list.get(i);
                count = 1;
                max = 1;
            } else if (list.get(i) == tmp) {
                count++;
            } else {
                if (count > max)
                    max = count;
                count = 1;
                tmp = list.get(i);
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);

    }
}