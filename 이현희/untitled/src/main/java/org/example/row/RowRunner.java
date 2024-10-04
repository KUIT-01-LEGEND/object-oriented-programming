package org.example.row;

public class RowRunner {
    private RowBoard rowBoard;
    private int size;

    public RowRunner(RowBoard rowBoard, int size) {
        this.rowBoard = rowBoard;
        this.size = size;
    }

    public int run(int startPos) {
        if(startPos != 1 && rowBoard.isLineExist(startPos-1))
            return startPos-1;
        if(startPos != size-1 && rowBoard.isLineExist(startPos))
            return startPos+1;
        return startPos;
    }
}
