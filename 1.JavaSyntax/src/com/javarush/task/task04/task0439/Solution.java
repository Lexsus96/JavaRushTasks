package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s любит меня.\n", name);
        }
    }
}
