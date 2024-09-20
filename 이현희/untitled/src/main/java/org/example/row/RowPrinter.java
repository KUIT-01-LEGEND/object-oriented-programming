package org.example.row;

public class RowPrinter {
    private int[] board;

    public RowPrinter(int[] board) {
        this.board = board;
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
        for (int pos = 1; pos < board.length+1; pos++) {
            str.append(board[pos-1]);
            if(currentPos == pos)
                str.append("*");
            str.append(" ");
        }
        System.out.println(str);
        return str.toString();
    }
}
