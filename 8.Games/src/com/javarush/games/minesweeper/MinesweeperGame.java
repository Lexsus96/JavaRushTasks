package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG ="\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped = false;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.BISQUE, "Game over! You lose!", Color.RED, 70);
    }
    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.BISQUE, "Game over! You win!", Color.GREEN, 70);
    }
    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        score = 0;
        setScore(score);
        createGame();
    }
    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.AZURE);
                setCellValue(x, y, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }
    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void markTile(int x, int y) {
        if (!isGameStopped && !gameField[y][x].isOpen && !(countFlags == 0 && !gameField[y][x].isFlag)) {
            if (gameField[y][x].isFlag) {
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellValue(x, y, "");
                setCellColor(x, y, Color.AZURE);
            } else {
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }
    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
        } else {
            openTile(x, y);
        }
    }
    private void openTile(int x, int y) {
        if(!isGameStopped && !gameField[y][x].isOpen && !gameField[y][x].isFlag) {
            gameField[y][x].isOpen = true;
            if (gameField[y][x].isMine) {
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
            } else {
                score += 5;
                setScore(score);
                setCellColor(x, y, Color.GREEN);
                countClosedTiles--;
                if (gameField[y][x].countMineNeighbors == 0) {
                    setCellValue(x, y, "");
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    for (GameObject gameObject : neighbors) {
                        if (!gameObject.isOpen) {
                            openTile(gameObject.x, gameObject.y);
                        }
                    }
                } else {
                    setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                }
                if (countClosedTiles == countMinesOnField) {
                    win();
                }
            }
        }
    }
    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (!gameField[y][x].isMine) {
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    int count = 0;
                    for (GameObject neighbor : neighbors) {
                        if (neighbor.isMine) {
                            count++;
                        }
                    }
                    gameField[y][x].countMineNeighbors = count;
                }
            }
        }
    }
    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }
}