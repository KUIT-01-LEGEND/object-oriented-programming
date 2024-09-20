import org.example.Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void 보드에선그리기() {
        //given
        int numberOfPeople = 6;
        int height = 6;
        Board board = new Board(numberOfPeople, height);

        //when
        int xPos = 3;
        int yPos = 3;
        board.drawLine(xPos, yPos);

        //then
        assertEquals(board.isLineExist(xPos, yPos), true);
    }

    @Test
    public void 보드에서실행하기() {
        //given
        int numberOfPeople = 6;
        int height = 6;
        Board board = new Board(numberOfPeople, height);

        //when
        int startPos = 3;
        board.drawLine(2, 2);
        board.drawLine(2, 3);
        board.drawLine(3, 4);
        board.drawLine(3, 5);
        int ret = board.run(xPos);

        //then
        assertEquals(ret, 3);
    }

    @Test
    public void 보드출력하기() {
        //given
        int numberOfPeople = 6;
        int height = 6;
        Board board = new Board(numberOfPeople, height);

        //when
        board.drawLine(2, 2);
        board.drawLine(2, 3);
        board.drawLine(3, 4);
        board.drawLine(3, 5);
        String[] str = board.print().split();

        //then
        assertEquals(str[0], "0 0 0 0 0 \n");
        assertEquals(str[1], "0 1 0 0 0 \n");
        assertEquals(str[2], "0 1 0 0 0 \n");
        assertEquals(str[3], "0 0 1 0 0 \n");
        assertEquals(str[4], "0 0 1 0 0 \n");
        assertEquals(str[5], "0 0 0 0 0 \n");
    }
}
