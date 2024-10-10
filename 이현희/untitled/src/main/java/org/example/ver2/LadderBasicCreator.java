package org.example.ver2;

public class LadderBasicCreator implements LadderCreator{
    public Ladder makeLadder(int width, int height) {
        Row[] rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }

        return new Ladder(rows);
    }
}
