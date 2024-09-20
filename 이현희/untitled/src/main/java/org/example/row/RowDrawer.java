package org.example.row;

public class RowDrawer {
    private Board board;
    private int size;

    public RowDrawer(Board board, int size) {
        this.board = board;
        this.size = size;
    }
    public void drawLine(int pos) {
        if(pos != 1 && board.isLineExist(pos-1))
            return;
        if(pos != size && board.isLineExist(pos+1))
            return;
        board.setPosValue(pos, 1);
    }
}
