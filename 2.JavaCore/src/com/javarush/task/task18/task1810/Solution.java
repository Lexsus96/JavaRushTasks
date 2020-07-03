package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<FileInputStream> list = new ArrayList<>();
            boolean isOk = true;
            while (isOk) {
                String file = reader.readLine();
                FileInputStream inputStream = new FileInputStream(file);
                if (inputStream.available() >= 1000) {
                    list.add(inputStream);
                } else {
                    isOk = false;
                    for(FileInputStream f: list) {
                        f.close();
                    }
                    inputStream.close();
                    reader.close();
                    throw new DownloadException();
                }
            }
            reader.close();
            for(FileInputStream f: list) {
                f.close();
            }
        } catch (IOException e) {

        }
    }

    public static class DownloadException extends Exception {

    }
}
