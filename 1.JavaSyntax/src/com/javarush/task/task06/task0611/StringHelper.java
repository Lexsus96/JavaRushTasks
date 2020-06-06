package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            b.append(s);
        }
        //напишите тут ваш код
        return b.toString();
    }

    public static String multiply(String s, int count) {
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < count; i++) {
            b.append(s);
        }
        //напишите тут ваш код
        return b.toString();
    }

    public static void main(String[] args) {

    }
}
