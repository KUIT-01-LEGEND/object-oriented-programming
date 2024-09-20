import org.example.RowRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowRunnerTest {
    @Test
    public void 실행하기() {
        //given
        int size = 5;
        int[] board = new int[size];
        RowRunner rowRunner = new RowRunner(board, size);

        //when
        int startPos = 3;
        int ret = rowRunner.run(3);

        //then
        assertEquals(ret, 3);
    }
}
