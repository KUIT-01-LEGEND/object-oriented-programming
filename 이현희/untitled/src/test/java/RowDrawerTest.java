import org.example.RowDrawer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowDrawerTest {
    @Test
    public void 선그리기() {
        //given
        RowDrawer rowDrawer = new RawDrawer();

        //when
        int position;
        rowDrawer.drawLine(position);

        //then
        boolean ret = rowDrawer.isLineExist(position);
        assertEquals(ret, true);
    }

}
