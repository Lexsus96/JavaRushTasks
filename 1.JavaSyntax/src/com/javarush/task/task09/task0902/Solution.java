package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;

    }

    public static String method2() {
        method3();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
        //напишите тут ваш код
    }

    public static String method5() {
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
        //напишите тут ваш код
    }
}
