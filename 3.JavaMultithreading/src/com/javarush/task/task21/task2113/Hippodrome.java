package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;
    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome (List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public Horse getWinner() {
        Horse winner = null;
        for (Horse horse: horses) {
            if (winner == null) {
                winner = horse;
            } else {
                if (horse.getDistance() > winner.getDistance()) {
                    winner = horse;
                }
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.printf("Winner is %s!\n", getWinner().getName());
    }
    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        List<Horse> h = game.getHorses();
        h.add(new Horse("1", 3, 0));
        h.add(new Horse("1", 3, 0));
        h.add(new Horse("1", 3, 0));
        game.run();
        game.printWinner();
    }
}
