package org.example;

public class RowRunner {
    
    private int[] board;
    private int size;

    public RowRunner(int[] board, int size) {
        this.board = board;
        this.size = size;
    }

    public int run(int startPos) {
        if(startPos != 1 && isLineExist(startPos-1))
            return startPos-1;
        if(startPos != size-1 && isLineExist(startPos))
            return startPos+1;
        return startPos;
    }

    public boolean isLineExist(int pos) {
        return board[pos-1] == 1;
    }
}
