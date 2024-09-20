package org.example.ladder;

import org.example.row.Row;

public class LadderRunner {
    private LadderBoard ladderBoard;

    public LadderRunner(LadderBoard ladderBoard) {
        this.ladderBoard = ladderBoard;
    }

    public int run(int xPos) {
        int currentXPos = xPos;
        int yPos = 1;
        while(ladderBoard.isInYRange(yPos)) {
            Row row = ladderBoard.getPosRow(yPos);
            currentXPos = row.run(currentXPos);
            yPos++;
        }
        return currentXPos;
    }

    public int runWithPrint(int xPos) {
        int currentXPos = xPos;
        int yPos = 1;
        while(ladderBoard.isInYRange(yPos)) {
            Row row = ladderBoard.getPosRow(yPos);
            currentXPos = row.runWithPrint(currentXPos);
            yPos++;
        }
        return currentXPos;
    }
}
