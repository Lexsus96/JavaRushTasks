package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()) {
            String s = reader.readLine();
            String name = s.split(" \\d+ \\d+ \\d+")[0];
            String date = s.substring(name.length() + 1);
            PEOPLE.add(new Person(name, new SimpleDateFormat("d M y").parse(date)));
        }
        reader.close();
    }
}
