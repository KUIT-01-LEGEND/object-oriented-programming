package org.example.row;

public class RowDrawer {
    private int[] board;
    private int size;

    public RowDrawer(int[] board, int size) {
        this.board = board;
        this.size = size;
    }
    public void drawLine(int pos) {
        if(pos != 1 && isLineExist(pos-1))
            return;
        if(pos != size && isLineExist(pos+1))
            return;
        board[pos-1] = 1;
    }

    public boolean isLineExist(int pos) {
        return board[pos-1] == 1;
    }
}
