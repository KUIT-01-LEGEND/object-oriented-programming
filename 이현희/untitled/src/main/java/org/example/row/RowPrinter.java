package org.example.row;

public class RowPrinter {
    private RowBoard rowBoard;

    public RowPrinter(RowBoard rowBoard) {
        this.rowBoard = rowBoard;
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        int pos = 1;
        int val;
        while((val = rowBoard.getPosValue(pos)) != -1) {
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
        while((val = rowBoard.getPosValue(pos)) != -1) {
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
