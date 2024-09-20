package org.example.row;

public class RowRunner {
    private Board board;
    private int size;

    public RowRunner(Board board, int size) {
        this.board = board;
        this.size = size;
    }

    public int run(int startPos) {
        if(startPos != 1 && board.isLineExist(startPos-1))
            return startPos-1;
        if(startPos != size-1 && board.isLineExist(startPos))
            return startPos+1;
        return startPos;
    }
}
