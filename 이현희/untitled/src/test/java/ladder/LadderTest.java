package ladder;

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

    @Test
    public void 선을하나도안그렸을때_실행하기() {
        //given
        Ladder ladder1 = new Ladder(6, 6);
        Ladder ladder2 = new Ladder(6, 6);
        Ladder ladder3 = new Ladder(6, 6);
        Ladder ladder4 = new Ladder(6, 6);
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;

        //when
        int ret1 = ladder1.run(x1);
        int ret2 = ladder2.run(x2);
        int ret3 = ladder3.run(x3);
        int ret4 = ladder4.run(x4);

        //then
        assertEquals(ret1, x1);
        assertEquals(ret2, x2);
        assertEquals(ret3, x3);
        assertEquals(ret4, x4);
    }

    @Test
    public void 대충선긋고_실행하기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x1 = 2;
        int x2 = 3;
        int x3 = 6;
        ladder.drawLine(1, 2);
        ladder.drawLine(4, 2);
        ladder.drawLine(3, 3);
        ladder.drawLine(1, 4);
        ladder.drawLine(4, 4);

        //when
        int ret1 = ladder.run(x1);
        int ret2 = ladder.run(x2);
        int ret3 = ladder.run(x3);

        //then
        assertEquals(ret1, 2);
        assertEquals(ret2, 5);
        assertEquals(ret3, 6);
    }

    @Test
    public void 사다리모양출력하기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        ladder.drawLine(1, 2);
        ladder.drawLine(4, 2);
        ladder.drawLine(3, 3);
        ladder.drawLine(1, 4);
        ladder.drawLine(4, 4);

        //when
        ladder.printBoard();

        //then
    }

    @Test
    public void 실행하며사다리모양출력하기() {
        //given
        Ladder ladder = new Ladder(6, 6);
        int x = 2;
        ladder.drawLine(1, 2);
        ladder.drawLine(4, 2);
        ladder.drawLine(3, 3);
        ladder.drawLine(1, 4);
        ladder.drawLine(4, 4);

        //when
        int ret = ladder.runWithPrint(x);

        //then
        assertEquals(ret, 2);
    }
}
