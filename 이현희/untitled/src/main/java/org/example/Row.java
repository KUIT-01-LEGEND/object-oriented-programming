package org.example;

public class Row {
    private int[] board;
    private int size;
    private RowDrawer rowDrawer;
    private RowPrinter rowPrinter;

    public Row(int size) {
        board = new int[size];
        rowDrawer = new RowDrawer(board, size);
        rowPrinter = new RowPrinter(board);
    }

    public void drawLine(int pos) {
        rowDrawer.drawLine(pos);
    }

    public String print() {
        return rowPrinter.print();
    }

    public String printWithStar(int currentPos) {
        return rowPrinter.printWithStar(currentPos);
    }

    public boolean isLineExist(int pos) {
        return rowDrawer.isLineExist(pos);
    }

    public int run(int startPos) {
        if(startPos != 1 && isLineExist(startPos-1))
            return startPos-1;
        if(startPos != size-1 && isLineExist(startPos))
            return startPos+1;
        return startPos;
    }
}
