package org.example.ver2;

import java.util.Random;

public class LadderCreator {
    public Ladder makeLadder(int width, int height) {
        Row[] rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }

        return new Ladder(rows);
    }
    public Ladder makeLadderRandomly(int width, int height) {
        Row[] rows = new Row[height];
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
            drawHorizontalLine(rows, row, column);
        }

        return new Ladder(rows);
    }
    private void drawHorizontalLine(Row[] rows, int row, int column) {
        rows[row-1].drawLine(column);
    }
}
