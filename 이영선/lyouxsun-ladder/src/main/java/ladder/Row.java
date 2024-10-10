package ladder;

import static ladder.Direction.RIGHT;

public class Row {
    private final Direction[] row;

    public Row(int numberOfPerson) {
        this.row = new Direction[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            row[i] = Direction.NONE;
        }
    }

    public void calculateMovement(Position position) {
        Direction direction = row[position.getX()];
        switch (direction){
            case LEFT -> position.moveToLeft();
            case RIGHT -> position.moveToRight();
        }
    }

    public Direction getDirection(int x) {
        return row[x];
    }

    public void drawLine(int x) {
        row[x] = RIGHT;
        row[x+1] = Direction.LEFT;
    }

    public int countBridge(){
        int cnt = 0;
        for(Direction d:row){
            if(d == RIGHT){
                cnt += 1;
            }
        }
        return cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Direction direction : row) {
            sb.append(direction.getValue()).append(" ");
        }
        return sb.toString();
    }
}
