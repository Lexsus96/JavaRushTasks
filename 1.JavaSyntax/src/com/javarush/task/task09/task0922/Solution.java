package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat beginDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat finalDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = beginDateFormat.parse(reader.readLine()); //записываем в date введенную строку в формате beginDateFormat
        System.out.println(finalDateFormat.format(date).toUpperCase()); //выводим на экран преобразо
    }
}
