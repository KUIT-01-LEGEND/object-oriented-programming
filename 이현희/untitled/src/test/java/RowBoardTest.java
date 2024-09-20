import org.example.row.RowBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowBoardTest {
    @Test
    public void 보드에서라인존재하는지확인() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);

        //when
        int position = 3;
        boolean ret = rowBoard.isLineExist(position);

        //then
        assertEquals(ret, false);
    }
    @Test
    public void 보드에서라인존재하는지확인2() {
        //given
        int size = 5;
        int[] b = new int[size];
        b[2] = 1;
        RowBoard rowBoard = new RowBoard(b);

        //when
        int position = 3;
        boolean ret = rowBoard.isLineExist(position);

        //then
        assertEquals(ret, true);
    }
    @Test
    public void 보드에서값설정및확인() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);

        //when
        int pos = 3;
        rowBoard.setPosValue(pos, 1);
        int ret = rowBoard.getPosValue(pos);

        //then
        assertEquals(ret, 1);
    }
}
