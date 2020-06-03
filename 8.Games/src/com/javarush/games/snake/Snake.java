package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {
        boolean isWrong = false;
        switch (direction) {
            case UP:
                if (this.direction == Direction.DOWN || snakeParts.get(0).x == snakeParts.get(1).x)
                    isWrong = true;
                break;
            case DOWN:
                if (this.direction == Direction.UP || snakeParts.get(0).x == snakeParts.get(1).x)
                    isWrong = true;
                break;
            case LEFT:
                if (this.direction == Direction.RIGHT || snakeParts.get(0).y == snakeParts.get(1).y)
                    isWrong = true;
                break;
            case RIGHT:
                if (this.direction == Direction.LEFT || snakeParts.get(0).y == snakeParts.get(1).y)
                    isWrong = true;
                break;
            default:
                isWrong = true;
        }
        if (!isWrong)
            this.direction = direction;
    }

    Snake(int x, int y){
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.y < 0 || newHead.x >= WIDTH || newHead.y >= HEIGHT || checkCollision(newHead)) {
            this.isAlive = false;
        } else {

            snakeParts.add(0, newHead);
            if (newHead.x == apple.x && newHead.y == apple.y){
                apple.isAlive = false;
            } else {
                removeTail();
            }
        }
    }
    public int getLength() {
        return snakeParts.size();
    }
    public GameObject createNewHead() {
        int x = snakeParts.get(0).x;
        int y = snakeParts.get(0).y;
        switch (direction) {
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
        return new GameObject(x, y);
    }
    public boolean checkCollision(GameObject gameObject) {
        for (GameObject member: snakeParts) {
            if (gameObject.x == member.x && gameObject.y == member.y) {
                return  true;
            }
        }
        return false;
    }
    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }
    public void draw(Game game) {
        boolean first = true;
        Color color;
        if (this.isAlive) {
            color = Color.GREEN;
        } else {
            color = Color.RED;
        }
        for (GameObject part: snakeParts) {
            if (first) {
                game.setCellValueEx(part.x, part.y, Color.NONE, HEAD_SIGN, color, 75);
                first = false;
                continue;
            }
            game.setCellValueEx(part.x, part.y, Color.NONE, BODY_SIGN, color, 75);
        }

    }
}
