package org.example.row;

public class Row {
    private Board board;
    private RowDrawer rowDrawer;
    private RowPrinter rowPrinter;
    private RowRunner rowRunner;

    public Row(int size) {
        board = new Board(size);
        rowDrawer = new RowDrawer(board, size);
        rowPrinter = new RowPrinter(board);
        rowRunner = new RowRunner(board, size);
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
        return board.isLineExist(pos);
    }
}
