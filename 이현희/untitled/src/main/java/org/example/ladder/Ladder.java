package org.example.ladder;

import org.example.Position;
import org.example.row.Row;

public class Ladder {
    private LadderBoard ladderBoard;
    private LadderDrawer ladderDrawer;
    private LadderPrinter ladderPrinter;
    private LadderRunner ladderRunner;

    public Ladder(int numberOfPeople, int height) {
        this.ladderBoard = new LadderBoard(numberOfPeople, height);
        this.ladderDrawer = new LadderDrawer(ladderBoard);
        this.ladderPrinter = new LadderPrinter(ladderBoard);
        this.ladderRunner = new LadderRunner(ladderBoard);
    }

    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int xPos, int yPos) {
        ladderDrawer.drawLine(xPos, yPos);
    }

    public int run(int xPos) {
        return ladderRunner.run(xPos);
    }

    public int runWithPrint(int xPos) {
        return ladderRunner.runWithPrint(xPos);
    }

    public String print() {
        return ladderPrinter.print();
    }

    public String printWithStar(int xPos, int yPos) {
        return ladderPrinter.printWithStar(xPos, yPos);
    }

    public int getPosValue(int xPos, int yPos) {
        return ladderBoard.getPosValue(xPos, yPos);
    }
}