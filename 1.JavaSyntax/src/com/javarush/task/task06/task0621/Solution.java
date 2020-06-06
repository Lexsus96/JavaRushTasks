package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gF = reader.readLine();
        Cat gFC = new Cat(gF);

        String gM = reader.readLine();
        Cat gMC = new Cat(gM);

        String daughterName = reader.readLine();
        Cat papa = new Cat(daughterName, null, gFC);

        String daughterName1 = reader.readLine();
        Cat mama = new Cat(daughterName1, gMC, null);

        String daughterName2 = reader.readLine();
        Cat catDaughter2 = new Cat(daughterName2, mama, papa);

        String daughterName3 = reader.readLine();
        Cat catDaughter3 = new Cat(daughterName3, mama, papa);

        System.out.println(gFC);
        System.out.println(gMC);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(catDaughter2);
        System.out.println(catDaughter3);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            StringBuffer s = new StringBuffer();
            s.append("The cat's name is ").append(name);
            if (mother == null)
                s.append(", no mother");
            else
                s.append(", mother is ").append(mother.name);
            if (father == null)
                s.append(", no father");
            else
                s.append(", father is ").append(father.name);
            return s.toString();
        }
    }

}
