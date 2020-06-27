package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0)
            return "0";
        if (n == 0)
            return "1";
        BigInteger i = f(BigInteger.valueOf(n));
        return i.toString();
    }

    public static BigInteger f(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(1)) == 0) {
            return n;
        }
        return n.multiply(f(n.subtract(BigInteger.valueOf(1))));
    }

}
