import org.example.row.RowBoard;
import org.example.row.RowDrawer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowDrawerTest {
    @Test
    public void 선그리기() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);
        RowDrawer rowDrawer = new RowDrawer(rowBoard, size);

        //when
        int position = 3;
        rowDrawer.drawLine(position);

        //then
        boolean ret = rowBoard.isLineExist(position);
        assertEquals(ret, true);
    }

}
