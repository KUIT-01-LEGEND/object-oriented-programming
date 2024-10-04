package ladder;

import org.example.ladder.LadderBoard;
import org.example.ladder.LadderRunner;
import org.example.row.RowBoard;
import org.example.row.RowRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderRunnerTest {
    @Test
    public void 실행하기() {
        //given
        int xSize = 6;
        int ySize = 6;
        LadderBoard ladderBoard = new LadderBoard(xSize, ySize);
        LadderRunner ladderRunner = new LadderRunner(ladderBoard);

        //when
        int startPos = 3;
        int ret = ladderRunner.run(startPos);

        //then
        assertEquals(ret, 3);
    }
}
