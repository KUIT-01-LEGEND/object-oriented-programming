package org.example.ver2;

public class Game {
    private Ladder ladder;
    public void makeLadder(int width, int height) {
        ladder = new LadderCreator().makeLadder(width, height);
    }
    public void makeLadderRandomly(int width, int height) {
        ladder = new LadderCreator().makeLadderRandomly(width, height);
    }
    public boolean drawHorizontalLine(int row, int column) {
        return ladder.drawHorizontalLine(row, column);
    }
    public int runGame(int startColumn) {
        return ladder.calcResult(startColumn);
    }
    public void printLadder(){
        ladder.print();
    }
}
