package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private Apple apple;
    private int turnDelay;
    private int score;
    private static final int GOAL = 28;
    private boolean isGameStopped;
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }
    private void createGame() {
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        turnDelay = 300;
        score = 0;
        setScore(score);
        isGameStopped = false;
        setTurnTimer(turnDelay);
        drawScene();

    }
    private void win(){
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.AQUA, "You win!", Color.GREEN, 75);
    }
    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.AQUA, "Game Over!", Color.RED, 75);
    }
    @Override
    public void onKeyPress(Key key) {
        switch (key){
            case RIGHT:
                snake.setDirection(Direction.RIGHT);
                break;
            case LEFT:
                snake.setDirection(Direction.LEFT);
                break;
            case DOWN:
                snake.setDirection(Direction.DOWN);
                break;
            case UP:
                snake.setDirection(Direction.UP);
                break;
            case SPACE:
                if (isGameStopped) {
                    createGame();
                }
                break;
        }
    }
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            score += 5;
            setScore(score);
            turnDelay -= 10;
            setTurnTimer(turnDelay);
            createNewApple();
        }
        if (!snake.isAlive) {
            gameOver();
        }
        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
    }
    private void createNewApple() {
        int newX, newY;
        do {
            newX = getRandomNumber(WIDTH);
            newY = getRandomNumber(HEIGHT);
            apple = new Apple(newX, newY);
        } while(snake.checkCollision(apple));
    }
    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");

            }
        }
        snake.draw(this);
        apple.draw(this);
    }

}
