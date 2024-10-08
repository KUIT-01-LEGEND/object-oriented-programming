package org.example.ver2;

import java.util.Random;

public class LadderRandomCreator implements LadderCreator{
    public Ladder makeLadder(int width, int height) {
        Row[] rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }
        Random random = new Random();
        System.out.println(width*height*0.3);
        for(int i=0;i<width*height*0.3-1;i++) {
            int row = random.nextInt(1, height);
            int column = random.nextInt(1, width);
            if(!drawHorizontalLine(rows, row, column)) {
                i--;
                continue;
            }
        }

        return new Ladder(rows);
    }
    private static boolean drawHorizontalLine(Row[] rows, int row, int column) {
        return rows[row-1].drawLine(column);
    }
}
