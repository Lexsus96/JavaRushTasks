package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        Integer[] mas = {5, 2, 4, 7, 0};
        ArrayList<int[]> arr = new ArrayList<>();
        for (Integer i: mas) {
            int[] tmp = new int[i];
            for (int j = 0; j < i; j++) {
                tmp[j] = j;
            }
            arr.add(tmp);
        }
        //напишите тут ваш код
        return arr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
