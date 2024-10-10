package org.example.ver2;

public class User {
    private Game game;
    public User(Game game) {
        this.game = game;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public void makeLadder(int width, int height) {
        game.makeLadder(width, height);
    }
    public boolean drawHorizontalLine(int row, int column) {
        return game.drawHorizontalLine(row, column);
    }
    public int runGame(int startColumn) {
        return game.runGame(startColumn);
    }
    public void print() {
        game.printLadder();
    }
}
