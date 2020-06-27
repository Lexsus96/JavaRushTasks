package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine();
            if(s.equals("helicopter")) {
                result = new Helicopter();
            } else if (s.equals("plane"))
                result = new Plane(Integer.parseInt(bf.readLine()));
            bf.close();

        } catch (IOException | NumberFormatException exception) {
            System.out.println(exception.getClass());
        }
        //add your code here - добавьте код тут
    }
}
