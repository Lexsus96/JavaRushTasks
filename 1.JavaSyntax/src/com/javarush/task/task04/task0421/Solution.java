package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        if (s.equals(s2)) {
            System.out.println("Имена идентичны");
        } else if (s.length() == s2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
