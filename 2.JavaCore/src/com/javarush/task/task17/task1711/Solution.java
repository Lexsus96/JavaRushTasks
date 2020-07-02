package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat n = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH );
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH );
        String sName, sSex, sDate, sIndex;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        sName = args[i++];
                        sSex = args[i++];
                        sDate = args[i++];
                        Date date = s.parse(sDate);
                        if (sSex.equals("м"))
                            allPeople.add(Person.createMale(sName, date));
                        else
                            allPeople.add(Person.createFemale(sName, date));
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        sIndex = args[i++];
                        sName = args[i++];
                        sSex = args[i++];
                        sDate = args[i++];

                        Date date2 = s.parse(sDate);
                        Person person = allPeople.get(Integer.parseInt(sIndex));
                        person.setName(sName);
                        person.setBirthDate(date2);
                        person.setSex(sSex.equals("м") ? Sex.MALE : Sex.FEMALE);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        sIndex = args[i++];
                        Person person2 = allPeople.get(Integer.parseInt(sIndex));
                        person2.setName(null);
                        person2.setBirthDate(null);
                        person2.setSex(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        sIndex = args[i++];
                        Person person3 = allPeople.get(Integer.parseInt(sIndex));
                        System.out.printf("%s %s %s\n", person3.getName(), person3.getSex().equals(Sex.MALE) ? "м" : "ж", n.format(person3.getBirthDate()));
                    }
                }
                break;
        }
    }
}
