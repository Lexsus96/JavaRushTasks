package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            if (a <= 0 || b <= 0)
                throw new Exception("");
            int r1, tmp;
            if (b > a) {
                tmp = a;
                a = b;
                b = tmp;
            }
            while(true) {
                    r1 = a % b;
                    if (r1 == 0) {
                        break;
                    } else {
                        a = b;
                        b = r1;
                    }
            }
            System.out.println(b);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
