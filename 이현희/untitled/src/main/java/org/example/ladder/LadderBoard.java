package org.example.ladder;

import org.example.Position;
import org.example.row.Row;

public class LadderBoard {
    private Row[] board;
    private int numberOfPeople;
    private int height;

    public LadderBoard(int numberOfPeople, int height) {
        this.board = new Row[height];
        for (int i = 0; i < board.length; i++)
            board[i] = new Row(numberOfPeople);
        this.numberOfPeople = numberOfPeople;
        this.height = height;
    }

    public Row getPosRow(int yPos) {
        return board[yPos-1];
    }
    public boolean isLineExist(int xPos, int yPos) {
        return board[yPos-1].isLineExist(xPos);
    }
    public boolean isInYRange(int yPos) {
        if(yPos < 1 || yPos > height)
            return false;
        return true;
    }
    public boolean isInXRange(int xPos) {
        if(xPos < 1 || xPos > numberOfPeople)
            return false;
        return true;
    }
    public boolean isSameWithHeight(int yPos) {
        return yPos == height;
    }
    public boolean isSameWithNumberOfPeople(int xPos) {
        return xPos == numberOfPeople;
    }
    public int getPosValue(int xPos, int yPos) {
        Row row = getPosRow(yPos);
        return row.isLineExist(xPos) ? 1 : 0;
    }
}
