package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader alllinesreader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader removelinesreader = new BufferedReader(new FileReader(reader.readLine()));
            while(alllinesreader.ready()) {
                allLines.add(alllinesreader.readLine());
            }
            while(removelinesreader.ready()) {
                forRemoveLines.add(removelinesreader.readLine());
            }
            alllinesreader.close();
            removelinesreader.close();
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException  e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        boolean b = true;
        for (String s: forRemoveLines) {
            boolean k = false;
            for (String i : allLines) {
                if (i.equals(s)) {
                    k = true;
                    break;
                }
            }
            if (!k) {
                b = false;
                break;
            }
        }
        if (b) {
            for (String s: forRemoveLines) {
                allLines.removeIf(i -> i.equals(s));
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
