package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grand1 = new Human("1", true, 1);
        Human grand2 = new Human("1", true, 1);
        Human grand3 = new Human("1", false, 1);
        Human grand4 = new Human("1", false, 1);
        Human mama = new Human("1", false, 1, grand1, grand3);
        Human papa = new Human("1", true, 1, grand2, grand4);
        Human child = new Human("1", true, 1, papa, mama);
        Human child2 = new Human("1", false, 1, papa, mama);
        Human child3 = new Human("1", true, 1, papa, mama);
        System.out.println(grand1);
        System.out.println(grand2);
        System.out.println(grand3);
        System.out.println(grand4);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
            String name;
            int age;
            boolean sex;
            Human father;
            Human mother;
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}