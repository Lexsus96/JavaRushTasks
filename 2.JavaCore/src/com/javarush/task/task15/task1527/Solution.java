package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String result = reader.readLine();
            String obj = null;
            String[] arr = result.substring(result.indexOf('?') + 1).split("&");
            for (String s: arr) {
                if (s.contains("obj")){
                    obj = s.substring(s.indexOf('=') + 1);
                }
                if (s.contains("=")) {
                    System.out.print(s.substring(0, s.indexOf('=')) + " ");
                } else {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
            if (obj != null) {
                try {
                    alert(Double.parseDouble(obj));
                } catch (NumberFormatException e) {
                    alert(obj);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
