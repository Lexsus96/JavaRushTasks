package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child = new Human("1", true, 1);
        Human child1 = new Human("1", true,1);
        Human child2 = new Human("1", true, 1);
        Human papa = new Human("1", true, 1, child, child1, child2);
        Human mama = new Human("1", true, 1, child, child1, child2);
        Human baba = new Human("1", true, 1, papa);
        Human deda = new Human("1", true, 1, papa);
        Human baba1 = new Human("1", true, 1, mama);
        Human deda1 = new Human("1", true, 1, mama);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(baba);
        System.out.println(baba1);
        System.out.println(deda);
        System.out.println(deda1);
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;
        Human(String name, boolean sex, int age, Human ...humans){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
            this.children.addAll(Arrays.asList(humans));
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
