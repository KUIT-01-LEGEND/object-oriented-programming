import org.example.Ladder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderTest {
    @Test
    public void 가장_위_사다리에_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 1;
        ladder.drawLine(x, y);
        //then
        assertEquals(ladder.getShape()[y-1][x-1], 0);
    }

    @Test
    public void 가장_아래쪽_사다리에_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 6;
        ladder.drawLine(x, y);
        //then
        assertEquals(ladder.getShape()[y-1][x-1], 0);
    }

    @Test
    public void 중간_사다리에_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 4;
        ladder.drawLine(x, y);
        //then
        assertEquals(ladder.getShape()[y-1][x-1], 1);
    }
}
