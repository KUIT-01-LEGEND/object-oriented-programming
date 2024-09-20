import org.example.RowDrawer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowDrawerTest {
    @Test
    public void 선그리기() {
        //given
        int size = 5;
        int[] board = new int[size];
        RowDrawer rowDrawer = new RowDrawer(board, size);

        //when
        int position = 3;
        rowDrawer.drawLine(position);

        //then
        boolean ret = rowDrawer.isLineExist(position);
        assertEquals(ret, true);
    }

}
