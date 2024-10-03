package ladder;

import java.util.Random;

public class Ladder {

    private Row[] rows;
    private final ValidNumber row;
    private final ValidNumber numberOfPerson;
    private final int bridgeNum;


    public Ladder(ValidNumber row, ValidNumber numberOfPerson, int bridgeLimit) {
        this.row = row;
        this.numberOfPerson = numberOfPerson;
        rowsInit();
        this.bridgeNum = setBridgeNum(bridgeLimit);
    }

    private void rowsInit() {
        this.rows = new Row[row.getNum()];
        for (int i = 0; i < row.getNum(); i++) {
            rows[i] = new Row(numberOfPerson.getNum());
        }
    }

    private int setBridgeNum(int bridgeLimit) {
        Random random = new Random();
        while (true) {
            int next = random.nextInt();
            if (0 < next && next < bridgeLimit) {
                return next;
            }
        }
    }

    public ValidNumber getRow() {
        return row;
    }

    public ValidNumber getNumberOfPerson() {
        return numberOfPerson;
    }

    public int getBridgeNum() {
        return bridgeNum;
    }

    public boolean validBridge(int y, int x) {
        Direction direction = rows[y].getDirection(x);

        // 첫 번째 조건: 현재 위치의 방향이 NONE이어야 함
        boolean firstCondition = (direction == Direction.NONE);

        // 두 번째 조건: 다리를 놓을 곳, 즉 현재 위치에서 오른쪽으로 한칸 간 곳이 NONE 이어야함
        boolean secondCondition = (y == numberOfPerson.getNum() - 1 || (x + 1 < numberOfPerson.getNum() && rows[y].getDirection(x + 1) == Direction.NONE));

        return firstCondition && secondCondition;
    }


    public void drawLine(int y, int x) {
        rows[y].drawLine(x);
    }

    public void print() {
        for (Row row : rows) {
            System.out.println(row);
        }
    }

    public int countBridgeInLadder(){
        int cnt = 0;
        for(Row row : rows){
            cnt += row.countBridge();
        }
        return cnt;
    }
}
