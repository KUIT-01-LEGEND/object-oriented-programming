import org.example.row.Board;
import org.example.row.RowRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowRunnerTest {
    @Test
    public void 실행하기() {
        //given
        int size = 5;
        Board board = new Board(size);
        RowRunner rowRunner = new RowRunner(board, size);

        //when
        int startPos = 3;
        int ret = rowRunner.run(3);

        //then
        assertEquals(ret, 3);
    }
}
