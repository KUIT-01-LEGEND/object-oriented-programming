package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Game game = new Game();

        user.makeLadder(game, 3, 3);
        user.drawHorizontalLine(game, 1, 1);
        user.print(game);
        System.out.println(user.runGame(game, 1));
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
    public void print(Game game) {
        game.printLadder();
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
        return ladder.calcResult(startColumn);
    }
    public void printLadder(){
        ladder.print();
    }
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
        int result = startColumn;
        for (int i = 0; i < rows.length; i++) {
            result = rows[i].calcResult(result);
        }
        return result;
    }
    public void print() {
        for (int i = 0; i < rows.length; i++) {
            rows[i].print();
        }
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
        if(startColumn - 2 >= 0 && lines[startColumn-2].checkIsLineDrawed())
            return startColumn - 1;
        if(lines[startColumn - 1].checkIsLineDrawed())
            return startColumn + 1;
        return startColumn;
    }
    public void print() {
        for (int i = 0; i < 2 * lines.length - 1; i++) {
            if(i%2==0)
                System.out.print("|");
            else
                lines[(i-1)/2].print();
        }
        System.out.println();
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
        return isLineDrawed;
    }
    public void print() {
        if(isLineDrawed)
            System.out.print("-");
        else
            System.out.print(" ");
    }
}

