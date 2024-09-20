package org.example.row;

public class RowPrinter {
    private Board board;

    public RowPrinter(Board board) {
        this.board = board;
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        int pos = 1;
        int val;
        while((val = board.getPosValue(pos)) != -1) {
            str.append(val).append(" ");
            pos++;
        }
        System.out.println(str);
        return str.toString();
    }
    public String printWithStar(int currentPos) {
        StringBuilder str = new StringBuilder();
        int pos = 1;
        int val;
        while((val = board.getPosValue(pos)) != -1) {
            str.append(val);
            if(currentPos == pos)
                str.append("*");
            str.append(" ");
            pos++;
        }
        System.out.println(str);
        return str.toString();
    }
}
