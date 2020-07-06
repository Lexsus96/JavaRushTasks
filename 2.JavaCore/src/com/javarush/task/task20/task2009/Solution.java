package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution  {
    public static class ClassWithStatic implements Serializable, Externalizable{
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(i);
            out.writeInt(j);
            out.writeChars(staticString);

        }
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.i = in.readInt();
            this.j = in.readInt();
            staticString = in.readLine();
        }
    }

    public static void main(String[] args) {

    }
}
