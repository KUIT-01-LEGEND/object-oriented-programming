package org.example.ver2;

public class User {
    public void makeLadder(Game game, int width, int height) {
        game.makeLadder(width, height);
    }
    public void makeLadderRandomly(Game game, int width, int height) {
        game.makeLadderRandomly(width, height);
    }
    public boolean drawHorizontalLine(Game game, int row, int column) {
        return game.drawHorizontalLine(row, column);
    }
    public int runGame(Game game, int startColumn) {
        return game.runGame(startColumn);
    }
    public void print(Game game) {
        game.printLadder();
    }
}
