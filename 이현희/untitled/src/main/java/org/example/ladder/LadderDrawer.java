package org.example.ladder;

import org.example.Drawer;
import org.example.row.Row;

public class LadderDrawer {
    LadderBoard ladderBoard;

    public LadderDrawer(LadderBoard ladderBoard) {
        this.ladderBoard = ladderBoard;
    }

    public void drawLine(int xPos, int yPos) {
        if(xPos == 1 || ladderBoard.isSameWithHeight(yPos) || yPos == 1)
            return;
        Row row = ladderBoard.getPosRow(yPos);
        row.drawLine(xPos);
    }
}
