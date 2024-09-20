package org.example;

public class LadderBoard {
    private int[][] board;
    private int numberOfPeople;
    private int height;

    public LadderBoard(int numberOfPeople, int height) {
        this.numberOfPeople = numberOfPeople;
        this.height = height;
        this.board = new int[height][numberOfPeople];
    }

    public void addLine(int x, int y) {
        board[y-1][x-1] = 1;
    }

    public boolean isLineExist(int x, int y) {
        return board[y-1][x-1] == 1;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getHeight() {
        return height;
    }
}
