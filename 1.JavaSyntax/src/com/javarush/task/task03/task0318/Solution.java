package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bis = new BufferedReader(reader);
        String age = bis.readLine();
        String name = bis.readLine();
        System.out.println(name + " захватит мир через "+ age + " лет. Му-ха-ха!");
    }
}
