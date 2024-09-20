package org.example;

public class RowDrawer {
    private int[] board;
    private int size;

    public RowDrawer(int[] board, int size) {
        this.board = board;
        this.size = size;
    }
    public void drawLine(int position) {
        if(position >= size)
            return;
        board[position-1] = 1;
    }

    public boolean isLineExist(int position) {
        return board[position-1] == 1;
    }
}
