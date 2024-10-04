package org.example.ver2;

public class Game {
    Ladder ladder = new Ladder();
    public void makeLadder(int width, int height) {
        ladder.makeLadder(width, height);
    }
    public void makeLadderRandomly(int width, int height) {
        ladder.makeLadderRandomly(width, height);
    }
    public void drawHorizontalLine(int row, int column) {
        ladder.drawHorizontalLine(row, column);
    }
    public int runGame(int startColumn) {
        return ladder.calcResult(startColumn);
    }
    public void printLadder(){
        ladder.print();
    }
}
