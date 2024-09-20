package org.example.row;

public class Row {
    private RowBoard rowBoard;
    private RowDrawer rowDrawer;
    private RowPrinter rowPrinter;
    private RowRunner rowRunner;

    public Row(int size) {
        rowBoard = new RowBoard(size);
        rowDrawer = new RowDrawer(rowBoard, size);
        rowPrinter = new RowPrinter(rowBoard);
        rowRunner = new RowRunner(rowBoard, size);
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

    public int run(int startPos) {
        return rowRunner.run(startPos);
    }
    public int runWithPrint(int startPos) {
        rowPrinter.printWithStar(startPos);
        return rowRunner.run(startPos);
    }

    public boolean isLineExist(int pos) {
        return rowBoard.isLineExist(pos);
    }
}
