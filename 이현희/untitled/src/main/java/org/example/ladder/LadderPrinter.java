package org.example.ladder;

import org.example.row.Row;

public class LadderPrinter {
    private LadderBoard ladderBoard;

    public LadderPrinter(LadderBoard ladderBoard) {
        this.ladderBoard = ladderBoard;
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        int yPos = 1;
        while(ladderBoard.isInYRange(yPos)) {
            Row row = ladderBoard.getPosRow(yPos);
            str.append(row.print()).append("\n");
            yPos++;
        }
        System.out.println(str);
        return str.toString();
    }

    public String printWithStar(int xPos, int yPos) {
        StringBuilder str = new StringBuilder();
        int yPosition = 1;
        while(ladderBoard.isInYRange(yPosition)) {
            Row row = ladderBoard.getPosRow(yPosition);
            if(yPosition == yPos)
                str.append(row.printWithStar(xPos));
            else
                str.append(row.print());
            str.append("\n");
            yPosition++;
        }
        System.out.println(str);
        return str.toString();
    }
}
