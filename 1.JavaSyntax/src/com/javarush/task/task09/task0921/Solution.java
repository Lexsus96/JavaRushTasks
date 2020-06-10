package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import sun.security.krb5.internal.crypto.Aes128;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                arr.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (NumberFormatException e) {
            for (Integer a: arr) {
                System.out.println(a);
            }
        }
    }
}
