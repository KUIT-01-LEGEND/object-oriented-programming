package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Game game = new Game();

        user.makeLadder(game, 3, 3);
    }
}


class User {
    public void makeLadder(Game game, int width, int height) {
        game.makeLadder(width, height);
    }
    public void drawHorizontalLine(Game game, int row, int column) {
        game.drawHorizontalLine(row, column);
    }
    public int runGame(Game game, int startColumn) {
        return game.runGame(startColumn);
    }
}

class Game {
    Ladder ladder = new Ladder();
    public void makeLadder(int width, int height) {
        ladder.makeLadder(width, height);
    }
    public void drawHorizontalLine(int row, int column) {
        ladder.drawHorizontalLine(row, column);
    }
    public int runGame(int startColumn) {
        return ladder.calcResult(startColumn); }
}

class Ladder {
    Row[] rows;
    public void makeLadder(int width, int height) {
        rows = new Row[height];
        for (int i = 0; i < height; i++) {
            rows[i] = new Row(width);
        }
    }
    public void drawHorizontalLine(int row, int column) {
        rows[row-1].drawLine(column);
    }
    public int calcResult(int startColumn) {
        return -1;
    }
}

class Row {
    Line[] lines;
    public Row(int width) {
        lines = new Line[width];
        for (int i = 0; i < width; i++) {
            lines[i] = new Line();
        }
    }
    public void drawLine(int column) {
        if(column - 2 >= 0 && lines[column-2].checkIsLineDrawed())
            return;
        if(column <= lines.length -1 && lines[column].checkIsLineDrawed())
            return;
        lines[column-1].drawLine();
    }
    public int calcResult(int startColumn) {
        return -1;
    }
}

class Line {
    boolean isLineDrawed;

    public Line() {
        isLineDrawed = false;
    }
    public void drawLine() {
        isLineDrawed = true;
    }
    public boolean checkIsLineDrawed() {
        return false;
    }
}

