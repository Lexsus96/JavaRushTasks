package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement i = Thread.currentThread().getStackTrace()[2];
        System.out.printf("%s: %s: %s\n", i.getClassName(), i.getMethodName(), s);
    }
}
