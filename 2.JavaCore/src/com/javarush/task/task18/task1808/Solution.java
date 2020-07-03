package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            String file3 = reader.readLine();
            reader.close();
            FileInputStream input = new FileInputStream(file1);
            FileOutputStream output2 = new FileOutputStream(file2);
            FileOutputStream output3 = new FileOutputStream(file3);
            int bytes = input.available();
            if (bytes != 0) {
                byte[] buf2;
                byte[] buf3;
                int sizeBuf2 = bytes / 2;
                if (bytes % 2 == 1) {
                    sizeBuf2++;
                }
                buf2 = new byte[sizeBuf2];
                buf3 = new byte[bytes / 2];
                input.read(buf2);
                input.read(buf3);
                output2.write(buf2);
                output3.write(buf3);

            }
            input.close();
            output2.close();
            output3.close();
        } catch (IOException e) {
        }
    }
}
