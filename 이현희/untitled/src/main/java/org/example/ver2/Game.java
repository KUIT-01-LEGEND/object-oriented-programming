package org.example.ver2;

public class Game {
    private Ladder ladder;
    private LadderCreator ladderCreator;
    public Game(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }
    public void makeLadder(int width, int height) {
        ladder = ladderCreator.makeLadder(width, height);
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
