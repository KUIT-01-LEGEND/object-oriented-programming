package ladder;

import org.example.ladder.LadderBoard;
import org.example.row.Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderBoardTest {
    @Test
    public void 원하는위치의값을읽어오기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int yPos = 3;
        Row row = ladderBoard.getPosRow(yPos);

        //then
        assertEquals(row.print().trim(), "0 0 0 0 0 0");
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

    @Test
    public void Y범위에있는값인지확인하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int yPos1 = 3;
        int yPos2 = 100;
        int yPos3 = -1;
        boolean ret1 = ladderBoard.isInYRange(yPos1);
        boolean ret2 = ladderBoard.isInYRange(yPos2);
        boolean ret3 = ladderBoard.isInYRange(yPos3);

        //then
        assertEquals(ret1, true);
        assertEquals(ret2, false);
        assertEquals(ret3, false);
    }

    @Test
    public void X범위에있는값인지확인하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int xPos1 = 3;
        int xPos2 = 100;
        int xPos3 = -1;
        boolean ret1 = ladderBoard.isInYRange(xPos1);
        boolean ret2 = ladderBoard.isInYRange(xPos2);
        boolean ret3 = ladderBoard.isInYRange(xPos3);

        //then
        assertEquals(ret1, true);
        assertEquals(ret2, false);
        assertEquals(ret3, false);
    }

    @Test
    public void height값과같은지확인하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);

        //when
        int yPos1 = 6;
        int yPos2 = 7;
        boolean ret1 = ladderBoard.isSameWithHeight(yPos1);
        boolean ret2 = ladderBoard.isSameWithHeight(yPos2);

        //then
        assertEquals(ret1, true);
        assertEquals(ret2, false);
    }
}
