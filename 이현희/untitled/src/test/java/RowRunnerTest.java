import org.example.RowRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowRunnerTest {
    @Test
    public void 실행하기() {
        //given
        RowRunner rowRunner = new RowRunner();

        //when
        int startPos = 3;
        int ret = rowRunner.run(3);

        //then
        assertEquals(ret, 3);
    }

    @Test
    public void 출력하며실행하기() {
        //given
        RowRunner rowRunner = new RowRunner();

        //when
        int startPos = 3;
        int ret = rowRunner.runWithPrint(3);

        //then
        assertEquals(ret, 3);
    }
}
