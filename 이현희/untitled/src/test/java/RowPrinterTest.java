import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowPrinterTest {
    @Test
    public void 출력하기() {
        //given
        RowPrinter rowPrinter = new RowPrinter();

        //when
        String str = rowPrinter.print();

        //then
        assertEquals(str, "0 0 0 0 0");
    }

    @Test
    public void 별섞어출력하기() {
        //given
        RowPrinter rowPrinter = new RowPrinter();

        //when
        int pos = 3;
        String str = rowPrinter.printWithStart(pos);

        //then
        assertEquals(str, "0 0 0* 0 0");
    }
}
