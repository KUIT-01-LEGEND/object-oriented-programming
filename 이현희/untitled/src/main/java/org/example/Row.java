package org.example;

public class Row {
    private int[] board;
    private int size;
    private RowDrawer rowDrawer;

    public Row(int size) {
        board = new int[size];
        rowDrawer = new RowDrawer(board, size);
    }

    public void drawLine(int pos) {
        rowDrawer.drawLine(pos);
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        for (int val : board)
            str.append(val).append(" ");
        System.out.println(str);
        return str.toString();
    }

    public String printWithStar(int currentPos) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            str.append(board[i]).append(" ");
            if(currentPos == i)
                str.append("*");
        }
        System.out.println(str);
        return str.toString();
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
