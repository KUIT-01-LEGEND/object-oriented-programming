import org.example.row.Board;
import org.example.row.RowDrawer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowDrawerTest {
    @Test
    public void 선그리기() {
        //given
        int size = 5;
        Board board = new Board(size);
        RowDrawer rowDrawer = new RowDrawer(board, size);

        //when
        int position = 3;
        rowDrawer.drawLine(position);

        //then
        boolean ret = board.isLineExist(position);
        assertEquals(ret, true);
    }

}
