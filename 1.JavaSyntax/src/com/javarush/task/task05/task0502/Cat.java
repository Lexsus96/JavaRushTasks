package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int thisWins = 0;
        if (this.age > anotherCat.age)
            thisWins++;
        else if (this.age < anotherCat.age)
            thisWins--;
        if (this.weight > anotherCat.weight)
            thisWins++;
        else if (this.weight < anotherCat.weight)
            thisWins--;
        if (this.strength > anotherCat.strength)
            thisWins++;
        else if (this.strength < anotherCat.strength)
            thisWins--;

        if(thisWins > 0) {
            return true;
        } else return thisWins >= 0;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
