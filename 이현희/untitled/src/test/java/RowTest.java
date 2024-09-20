import org.example.Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowTest {

    @Test
    public void 행에선그리기() {
        //given
        int size = 5;
        Row row = new Row(size);

        //when
        int position = 3;
        row.drawLine(position);

        //then
        assertEquals(row.isLineExist(position), true);
    }

    @Test
    public void 행에서실행하기() {
        //given
        int size = 5;
        Row row = new Row(size);
        int drawPosition = 3;
        row.drawLine(drawPosition);

        //when
        int startPosition = 3;
        int endPosition = row.run(startPosition);

        //then
        assertEquals(endPosition, 4);
    }

    @Test
    public void 행출력하기() {
        //given
        int size = 5;
        Row row = new Row(size);
        int position = 3;
        row.drawLine(position);

        //when
        String str = row.print();

        //then
        assertEquals(str, "0 0 1 0 0 ");
    }
}
