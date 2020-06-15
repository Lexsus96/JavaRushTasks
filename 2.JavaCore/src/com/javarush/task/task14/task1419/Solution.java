package com.javarush.task.task14.task1419;



import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        exceptions.addAll(Arrays.asList(new java.lang.IndexOutOfBoundsException(), new java.lang.ArithmeticException(),
                new java.lang.NullPointerException(),
                new java.lang.ArrayIndexOutOfBoundsException(),
                new java.lang.StringIndexOutOfBoundsException(),
                new java.io.FileNotFoundException(),
                new java.lang.ArrayStoreException(),
                new java.lang.ClassCastException(),
                new java.lang.NegativeArraySizeException(),
                new java.lang.NumberFormatException()));



    }
}
