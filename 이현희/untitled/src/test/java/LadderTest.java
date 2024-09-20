import org.example.Ladder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderTest {
    @Test
    public void 한명_중간높이_선긋기() {
        //given
        Ladder ladder = new Ladder(1, 5);

        //when
        int x = 1;
        int y = 3;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 한명_맨위_선긋기() {
        //given
        Ladder ladder = new Ladder(1, 5);

        //when
        int x = 1;
        int y = 1;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 한명_맨아래_선긋기() {
        //given
        Ladder ladder = new Ladder(1, 5);

        //when
        int x = 1;
        int y = 5;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 여러명_맨위_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 1;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 여러명_맨아래_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 6;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 여러명_중간높이_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 4;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 1);
    }

    @Test
    public void 여러명_맨오른쪽_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 6;
        int y = 4;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 0);
    }

    @Test
    public void 여러명_맨왼쪽_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);

        //when
        int x = 1;
        int y = 4;
        ladder.drawLine(x, y);

        //then
        assertEquals(ladder.getPosValue(x, y), 1);
    }

    @Test
    public void 여러명_왼쪽에선이있을때_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x1 = 2;
        int y1 = 4;
        ladder.drawLine(x1, y1);

        //when
        int x2 = 3;
        int y2 = 4;
        ladder.drawLine(x2, y2);

        //then
        assertEquals(ladder.getPosValue(x1, y1), 1);
        assertEquals(ladder.getPosValue(x2, y2), 0);
    }

    @Test
    public void 여러명_오쪽에선이있을때_선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x1 = 4;
        int y1 = 4;
        ladder.drawLine(x1, y1);

        //when
        int x2 = 3;
        int y2 = 4;
        ladder.drawLine(x2, y2);

        //then
        assertEquals(ladder.getPosValue(x1, y1), 1);
        assertEquals(ladder.getPosValue(x2, y2), 0);
    }

    @Test
    public void 여러명_오른쪽에선이있을때_가장왼쪽선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x1 = 2;
        int y1 = 4;
        ladder.drawLine(x1, y1);

        //when
        int x2 = 1;
        int y2 = 4;
        ladder.drawLine(x2, y2);

        //then
        assertEquals(ladder.getPosValue(x1, y1), 1);
        assertEquals(ladder.getPosValue(x2, y2), 0);
    }

    @Test
    public void 여러명_왼쪽에선이있을때_가장오른쪽에서한칸왼쪽에선긋기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x1 = 4;
        int y1 = 4;
        ladder.drawLine(x1, y1);

        //when
        int x2 = 5;
        int y2 = 4;
        ladder.drawLine(x2, y2);

        //then
        assertEquals(ladder.getPosValue(x1, y1), 1);
        assertEquals(ladder.getPosValue(x2, y2), 0);
    }
}
