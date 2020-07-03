package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 4 && args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(fileName));
            int max = 0;
            while (reader.ready()) {
                int x = Integer.parseInt(reader.readLine().substring(0, 8).split(" ")[0]);
                if (x > max)
                    max = x;
            }
            reader.close();
            max++;
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(String.format("\n%-8s%-30s%-8s%-4s\n", max, args[1], args[2], args[3]));
            writer.close();
        }
    }
}
