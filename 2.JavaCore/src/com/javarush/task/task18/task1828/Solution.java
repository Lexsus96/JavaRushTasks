package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        if ((args.length == 5 && (args[0].equals("-u")) || (args.length == 2 && args[0].equals("-d")))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(fileName));
            ArrayList<String> list = new ArrayList<>();
            int id = Integer.parseInt(args[1]);
            int index = -1;
            while (reader.ready()) {
                list.add(reader.readLine());
                int x = Integer.parseInt(list.get(list.size() - 1).substring(0, 8).split(" ")[0]);
                if (x == id) {
                    index = list.size() - 1;
                }
            }
            reader.close();
            if (index == -1) {
                return;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            switch (args[0]) {
                case "-u":
                    for (int i = 0; i < list.size(); i++) {
                        if (i == index) {
                            writer.write(String.format("%-8s%-30s%-8s%-4s\n", id, args[2], args[3], args[4]));
                        } else {
                            writer.write(list.get(i) + "\n");
                        }
                    }
                    break;
                case "-d":
                    for (int i = 0; i < list.size(); i++) {
                        if (i != index) {
                            writer.write(list.get(i) + "\n");
                        }
                    }
                    break;
            }
            writer.close();
        }
    }
}
