package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> hashSet = new HashSet<>(10);
        hashSet.addAll(Arrays.asList("арбуз банан вишня груша дыня ежевика женьшень земляника ирис картофель".split(" ")));
        for (String s: hashSet) {
            System.out.println(s);
        }
    }
}
