import org.example.row.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    @Test
    public void 보드에서라인존재하는지확인() {
        //given
        int size = 5;
        Board board = new Board(size);

        //when
        int position = 3;
        boolean ret = board.isLineExist(position);

        //then
        assertEquals(ret, false);
    }
    @Test
    public void 보드에서라인존재하는지확인2() {
        //given
        int size = 5;
        int[] b = new int[size];
        b[2] = 1;
        Board board = new Board(b);

        //when
        int position = 3;
        boolean ret = board.isLineExist(position);

        //then
        assertEquals(ret, true);
    }
    @Test
    public void 보드에서값설정및확인() {
        //given
        int size = 5;
        Board board = new Board(size);

        //when
        int pos = 3;
        board.setPosValue(pos, 1);
        int ret = board.getPosValue(pos);

        //then
        assertEquals(ret, 1);
    }
}
