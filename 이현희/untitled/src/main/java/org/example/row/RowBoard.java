package org.example.row;

public class RowBoard {
    private int[] board;
    private int size;

    public RowBoard(int size) {
        this.board = new int[size];
        this.size = size;
    }
    public RowBoard(int[] board) {
        this.board = board;
        this.size = board.length;
    }

    public boolean isLineExist(int pos) {
        return board[pos-1] == 1;
    }
    public void setPosValue(int pos, int value) {
        board[pos-1] = value;
    }
    public int getPosValue(int pos) {
        if(pos < 1 || pos > size)
            return -1;
        return board[pos-1];
    }
}
