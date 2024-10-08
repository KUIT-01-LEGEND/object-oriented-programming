package org.example.ver2;

import java.util.Random;

public class Ladder {
    private Row[] rows;
    public Ladder(Row[] rows) {
        this.rows = rows;
    }
    public boolean drawHorizontalLine(int row, int column) {
        return rows[row-1].drawLine(column);
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
