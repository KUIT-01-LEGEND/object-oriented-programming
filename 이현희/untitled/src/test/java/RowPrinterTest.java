import org.example.row.RowBoard;
import org.example.row.RowPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowPrinterTest {
    @Test
    public void 출력하기() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);
        RowPrinter rowPrinter = new RowPrinter(rowBoard);

        //when
        String str = rowPrinter.print();

        //then
        assertEquals(str.trim(), "0 0 0 0 0");
    }

    @Test
    public void 별섞어출력하기() {
        //given
        int size = 5;
        RowBoard rowBoard = new RowBoard(size);
        RowPrinter rowPrinter = new RowPrinter(rowBoard);

        //when
        int pos = 3;
        String str = rowPrinter.printWithStar(pos);

        //then
        assertEquals(str.trim(), "0 0 0* 0 0");
    }
}
