package ladder;

import org.example.row.RowBoard;
import org.example.row.RowPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderPrinterTest {
    @Test
    public void 출력하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);
        LadderPrinter ladderPrinter = new LadderPrinter(ladderBoard);

        //when
        String[] str = ladderPrinter.print().split("\n");

        //then
        assertEquals(str[0].trim(), "0 0 0 0 0");
        assertEquals(str[1].trim(), "0 0 0 0 0");
        assertEquals(str[2].trim(), "0 0 0 0 0");
        assertEquals(str[3].trim(), "0 0 0 0 0");
        assertEquals(str[4].trim(), "0 0 0 0 0");
        assertEquals(str[5].trim(), "0 0 0 0 0");
    }

    @Test
    public void 별섞어출력하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);
        LadderPrinter ladderPrinter = new LadderPrinter(ladderBoard);

        //when
        int currentXPos = 3;
        int currentYPos = 3;
        String[] str = ladderPrinter.printWithStar(currentXPos, currentYPos).split("\n");

        //then
        assertEquals(str[0].trim(), "0 0 0 0 0");
        assertEquals(str[1].trim(), "0 0 0 0 0");
        assertEquals(str[2].trim(), "0 0 0* 0 0");
        assertEquals(str[3].trim(), "0 0 0 0 0");
        assertEquals(str[4].trim(), "0 0 0 0 0");
        assertEquals(str[5].trim(), "0 0 0 0 0");
    }
}