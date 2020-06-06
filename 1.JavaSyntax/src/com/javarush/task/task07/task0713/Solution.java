package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> m = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            m.add(tmp);
            if (tmp % 3 == 0)
                a.add(tmp);
            if (tmp % 2 == 0)
                b.add(tmp);
            if ((tmp % 3 != 0) && (tmp % 2 != 0))
                c.add(tmp);
        }
        printList(a);
        printList(b);
        printList(c);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for(Integer i : list)
            System.out.println(i);

    }
}
