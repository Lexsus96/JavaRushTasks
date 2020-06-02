package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a,b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a == b && b == c) {
            System.out.printf("%d %d %d", a, a, a);
        } else if (a == b){
            System.out.printf("%d %d", a, a);
        } else if (b == c){
            System.out.printf("%d %d", b, b);
        } else if (a == c){
            System.out.printf("%d %d", a, a);
        }
    }
}