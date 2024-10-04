package ladder;

import org.example.ladder.LadderBoard;
import org.example.ladder.LadderDrawer;
import org.example.row.Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderDrawerTest {
    @Test
    public void 원하는위치에그리기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);
        LadderDrawer ladderDrawer = new LadderDrawer(ladderBoard);

        //when
        int xPos = 3;
        int yPos = 3;
        ladderDrawer.drawLine(xPos, yPos);
        Row ret = ladderBoard.getPosRow(yPos);

        //then
        assertEquals(ret.print().trim(), "0 0 1 0 0 0");
    }
}
