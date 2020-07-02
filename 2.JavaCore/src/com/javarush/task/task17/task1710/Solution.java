package com.javarush.task.task17.task1710;

import com.sun.jmx.snmp.ServiceName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут
        String param = args[0];
        SimpleDateFormat n = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH );
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH );
        String sName, sSex, sDate, sIndex;
        switch (param) {
            case "-c":
                sName = args[1];
                sSex = args[2];
                sDate = args[3];
                Date date = s.parse(sDate);
                if (sSex.equals("м"))
                    allPeople.add(Person.createMale(sName, date));
                else
                    allPeople.add(Person.createFemale(sName, date));
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                sIndex = args[1];
                sName = args[2];
                sSex = args[3];
                sDate = args[4];
                Date date2 = s.parse(sDate);
                Person person = allPeople.get(Integer.parseInt(sIndex));
                person.setName(sName);
                person.setBirthDate(date2);
                person.setSex(sSex.equals("м")?Sex.MALE:Sex.FEMALE);
                break;
            case "-d":
                sIndex = args[1];
                Person person2 = allPeople.get(Integer.parseInt(sIndex));
                person2.setName(null);
                person2.setBirthDate(null);
                person2.setSex(null);
                break;
            case "-i":
                sIndex = args[1];
                Person person3 = allPeople.get(Integer.parseInt(sIndex));
                System.out.printf("%s %s %s", person3.getName(), person3.getSex().equals(Sex.MALE)?"м": "ж", n.format(person3.getBirthDate()));
                break;
        }

    }
}
