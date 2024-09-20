package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderBoardTest {
    @Test
    public void 원하는위치의값을설정하고읽어오기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int xPos = 3;
        int yPos = 3;
        ladderBoard.setPosValue(xPos, yPos, 1);
        int ret = ladderBoard.getPosValue(xPos, yPos);

        //then
        assertEquals(ret, 1);
    }

    @Test
    public void 원하는위치에선이그려져있는지확인하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int xPos = 3;
        int yPos = 3;
        boolean ret = ladderBoard.isLineExist(xPos, yPos);

        //then
        assertEquals(ret, false);
    }
}
