package ladder;

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
        int ret = ladderBoard.getPosValue(xPos, yPos);

        //then
        assertEquals(ret, 1);
    }
}
