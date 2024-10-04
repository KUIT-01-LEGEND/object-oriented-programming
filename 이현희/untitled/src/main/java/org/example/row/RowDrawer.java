package org.example.row;

public class RowDrawer {
    private RowBoard rowBoard;
    private int size;

    public RowDrawer(RowBoard rowBoard, int size) {
        this.rowBoard = rowBoard;
        this.size = size;
    }

    public void drawLine(int pos) {
        if(pos != 1 && rowBoard.isLineExist(pos-1))
            return;
        if(pos != size && rowBoard.isLineExist(pos+1))
            return;
        rowBoard.setPosValue(pos, 1);
    }
}
