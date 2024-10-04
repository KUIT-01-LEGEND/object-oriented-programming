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
    public void drawHorizontalLine(int row, int column) {}
    public int runGame() { return -1; }
}

class Game {
    Ladder ladder = new Ladder();
    public void makeLadder(int width, int height) {
        ladder.makeLadder(width, height);
    }
    public void drawHorizontalLine(int row, int column) {}
    public int runGame() { return -1; }
}

class Ladder {
    Column[] columns;
    public void makeLadder(int width, int height) {
        columns = new Column[width];
        for (int i = 0; i < width; i++) {
            columns[i] = new Column(height);
        }
    }
    public void drawHorizontalLine(int row, int column) {}
    public int runGame() { return -1; }
}

class Column {
    Row[] rows;
    public Column(int height) {
        rows = new Row[height];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new Row();
        }
    }
    public void drawHorizontalLine(int row) {}
}

class Row {
    public Row() {

    }
    public void drawHorizontalLine() {}
}