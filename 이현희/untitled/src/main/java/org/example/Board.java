package org.example;

public class Board {
    private int[] board;
    private int size;

    public Board(int size) {
        this.board = new int[size];
        this.size = size;
    }
    public Board(int[] board) {
        this.board = board;
        this.size = board.length;
    }

    public boolean isLineExist(int pos) {
        return board[pos-1] == 1;
    }

}
