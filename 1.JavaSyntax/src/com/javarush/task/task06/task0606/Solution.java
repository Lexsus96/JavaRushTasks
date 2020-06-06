package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            if ((n & 1) == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
