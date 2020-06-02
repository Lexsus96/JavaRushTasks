package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList a = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        a.add(scanner.nextInt());
        Collections.sort(a);
        System.out.printf("%d %d %d\n", a.get(2), a.get(1), a.get(0));
    }
}
