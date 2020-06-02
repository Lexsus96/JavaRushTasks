package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            arr.add(scanner.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
}
