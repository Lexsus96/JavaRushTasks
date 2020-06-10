package com.javarush.task.task08.task0816;

import javafx.util.Pair;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("1", dateFormat.parse("APRIL 2 2012"));
        map.put("2", dateFormat.parse("JUNE 3 2012"));
        map.put("3", dateFormat.parse("JUNE 4 2012"));
        map.put("4", dateFormat.parse("AUG 5 2012"));
        map.put("5", dateFormat.parse("MAY 6 2012"));
        map.put("6", dateFormat.parse("MAY 7 2012"));
        map.put("7", dateFormat.parse("MAY 8 2012"));
        map.put("8", dateFormat.parse("MAY 9 2012"));
        map.put("9", dateFormat.parse("MAY 2 2012"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iter =  map.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();
            int mounth = pair.getValue().getMonth();
            if(mounth > 4 && mounth < 8) {
                iter.remove();
            }
        }

    }

    public static void main(String[] args)  {
    }
}
