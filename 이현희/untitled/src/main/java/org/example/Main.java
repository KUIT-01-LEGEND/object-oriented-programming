package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class User {
    public void makeLadder(int width, int height) {}
    public void drawHorizontalLine(int row, int column) {}
}

class Game {
    public void makeLadder(int width, int height) {}
    public void drawHorizontalLine(int row, int column) {}
}

class Ladder {
    public void makeLadder(int width, int height) {}
    public void drawHorizontalLine(int row, int column) {}
}

class Column {
    public Column[] makeColumns(int width) {
        return null;
    }
    public void drawHorizontalLine(int row) {}
}

class Row {
    public Row[] makeRows(int height) {
        return null;
    }
    public void drawHorizontalLine() {}
}