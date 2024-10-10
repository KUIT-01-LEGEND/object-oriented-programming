package ladder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LadderTest {
    @Test
    public void 사다리가_생성_성공() {
        // given
        int row = 3;
        int col = 5;


        // when
        Ladder ladder = LadderCreator.of(row, col);

        // then
        assertNotNull(ladder);
        assertEquals(row, ladder.getRow().getNum());
        assertEquals(col, ladder.getNumberOfPerson().getNum());

        BridgeCreator.drawLine(ladder);
    }

    @Test
    public void 사다리_생성시_예외가_발생해야_한다() {
        // given
        int row = -1;
        int col = 5;

        // when
        // then
        assertThrows(NotValidNumberException.class, () -> LadderCreator.of(row, col));
    }

    @Test
    public void 사다리_다리수_유효성검사() {
        // given
        int row = 6;
        int col = 9;

        // when
        Ladder ladder = LadderCreator.of(row, col);
        int bridgeNum = ladder.getBridgeNum();

        // then
        assertEquals(true, 0 < bridgeNum && bridgeNum < row * col / 2);
    }

    @Test
    void 사다리가_개수만큼_만들어졌나(){
        // given
        int row = 6;
        int col = 9;

        // when
        Ladder ladder = LadderCreator.of(row, col);
        int bridgeNum = ladder.getBridgeNum();

        // then
        assertEquals(bridgeNum, ladder.countBridgeInLadder());
        System.out.println("bridgeNum = " + bridgeNum);
    }


}