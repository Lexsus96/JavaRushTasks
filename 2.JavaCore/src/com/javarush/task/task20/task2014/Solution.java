package com.javarush.task.task20.task2014;

import com.sun.corba.se.pept.encoding.InputObject;
import com.sun.corba.se.pept.encoding.OutputObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(arrayOutputStream);
        Solution savedObject = new Solution(4);
        outputStream.writeObject(savedObject);
        ObjectInputStream inputObject = new ObjectInputStream(new ByteArrayInputStream(arrayOutputStream.toByteArray()));
        Solution loadedObject;
        loadedObject = (Solution) inputObject.readObject();
        System.out.println(savedObject.toString().equals(loadedObject.toString()));

    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

}
