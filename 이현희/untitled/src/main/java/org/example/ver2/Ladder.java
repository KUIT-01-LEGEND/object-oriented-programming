package org.example.ver2;

import java.util.Random;

public class Ladder {
    private Row[] rows;
    private LadderCreator ladderCreator;
    public void makeLadder(int width, int height) {
        rows = ladderCreator.makeLadder(width, height);
    }
    public void makeLadderRandomly(int width, int height) {
        ladderCreator.makeLadderRandomly(width, height);
    }
    public void drawHorizontalLine(int row, int column) {
        rows[row-1].drawLine(column);
    }
    public int calcResult(int startColumn) {
        int result = startColumn;
        for (int i = 0; i < rows.length; i++) {
            result = rows[i].calcResult(result);
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows.length; i++) {
            rows[i].print();
        }
    }
}
