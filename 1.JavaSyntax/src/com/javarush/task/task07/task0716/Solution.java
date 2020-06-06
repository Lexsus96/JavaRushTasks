package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); ) {
            String s = strings.get(i);
            Boolean isR = false, isL= false;
            isR = s.indexOf("р", 0) != -1;
            isL = s.indexOf("л", 0) != -1;
            if (isL && isR) {
                i++;
                continue;
            }
            if (isL){
                strings.add(i, s);
                i += 2;
                continue;
            }
            if (isR) {
                strings.remove(i);
                continue;
            }
            i++;
        }
        return strings;
    }
}