package org.example.ver2;

import java.util.Random;

public class Ladder {
    private Row[] rows;
    public void makeLadder(int width, int height) {
        rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }
    }
    public void makeLadderRandomly(int width, int height) {
        rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }
        Random random = new Random();
        System.out.println(width*height*0.3);
        for(int i=0;i<width*height*0.3;i++) {
            int row = random.nextInt(1, height);
            int column = random.nextInt(1, width);
            System.out.println(row + " " + column);
            drawHorizontalLine(row, column);
        }
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
