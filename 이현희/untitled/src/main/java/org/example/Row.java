package org.example;

public class Row {
    private int[] board;
    private int size;

    public Row(int size) {
        board = new int[size];
    }

    public void drawLine(int pos) {
        board[pos-1] = 1;
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        for (int val : board) {
            str.append(val).append(" ");
        }
        System.out.println(str);
        return str.toString();
    }

    public boolean isLineExist(int pos) {
        return board[pos-1] == 1;
    }

    public int run(int startPos) {
        if(startPos != 1 && isLineExist(startPos-1))
            return startPos-1;
        if(startPos != size-1 && isLineExist(startPos))
            return startPos+1;
        return startPos;
    }
}
