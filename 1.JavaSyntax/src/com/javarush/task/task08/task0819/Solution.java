package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iter = cats.iterator();
        cats.remove(iter.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat("1"));
        catSet.add(new Cat("2"));
        catSet.add(new Cat("3"));
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for(Cat cat: cats) {
            System.out.println(cat);
        }
    }
    public static class Cat {
        public String name;
        Cat(String name) {
            this.name = name;
        }
        Cat(){

        }
    }
    // step 1 - пункт 1
}
