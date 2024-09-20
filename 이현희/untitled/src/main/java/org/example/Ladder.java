package org.example;

public class Ladder {
    private Row[] board;
    private int numberOfPeople;
    private int height;

    public Ladder(int numberOfPeople, int height) {
        this.numberOfPeople = numberOfPeople;
        this.height = height;
        board = new Row[height];
        for (int i = 0; i < board.length; i++)
            board[i] = new Row(numberOfPeople);
    }

    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int xPos, int yPos) {
        if(xPos == numberOfPeople || yPos == height || yPos == 1)
            return;
        board[yPos-1].drawLine(xPos);
    }

    public int run(int xPos) {
        int currentXPos = xPos;
        for (int yPos = 1; yPos < height + 1; yPos++)
            currentXPos = board[yPos-1].run(currentXPos);
        return currentXPos;
    }

    public int runWithPrint(int xPos) {
        int currentXPos = xPos;
        for (int yPos = 1; yPos < height + 1; yPos++) {
            board[yPos-1].printWithStar(currentXPos);
            currentXPos = board[yPos-1].run(currentXPos);
        }
        return currentXPos;
    }

    public void printBoard() {
        for (int yPos = 1; yPos < height + 1; yPos++) {
            board[yPos-1].print();
            System.out.println("\n");
        }
    }

    public int getPosValue(int xPos, int yPos) {
        return board[yPos-1].isLineExist(xPos) ? 1 : 0;
    }
}