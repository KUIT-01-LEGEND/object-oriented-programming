import org.example.row.RowBoard;
import org.example.row.RowRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowRunnerTest {
    @Test
    public void 실행하기() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);
        RowRunner rowRunner = new RowRunner(rowBoard, size);

        //when
        int startPos = 3;
        int ret = rowRunner.run(startPos);

        //then
        assertEquals(ret, 3);
    }
}
