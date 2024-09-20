package org.example;

public class Ladder {

    private int[][] shape;
    private int numberOfPeople;
    private int height;

    public Ladder(int numberOfPeople, int height) {
        this.numberOfPeople = numberOfPeople;
        this.height = height;
        shape = new int[height][numberOfPeople];
    }

    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int x, int y) {
        Position pos = new Position(x, y);

        if(pos.isYEqual(1) || pos.isYEqual(height))
            return;
        if(pos.isXEqual(numberOfPeople))
            return;
        if(pos.isXEqual(1)) {
            if(shape[y-1][x] != 1)
                shape[y - 1][x - 1] = 1;
            return;
        }
        if(pos.isXEqual(numberOfPeople-1)) {
            if(shape[y-1][x-2] != 1)
                shape[y-1][x-1] = 1;
            return;
        }
        if(shape[y-1][x-2] == 1)
            return;
        if(shape[y-1][x] == 1)
            return;
        shape[y-1][x-1] = 1;
    }

    public int run(int xPos) {
        int x = xPos-1;
        for (int i = 0; i < height; i++) {
            if(x-1 >= 0 && shape[i][x-1] == 1)
                x--;
            else if(shape[i][x] == 1)
                x++;
        }
        return x+1;
    }

    public int getPosValue(int x, int y) {
        return shape[y-1][x-1];
    }

    public void printShape() {
        String ret = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numberOfPeople; j++) {
                ret += shape[i][j] + " ";
            }
            ret += "\n";
        }
        System.out.println(ret);
    }

    private void printShapeWithStar(int x, int y) {
        Position pos = new Position(x, y);

        String ret = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numberOfPeople; j++) {
                ret += shape[i][j];
                if(pos.equals(new Position(i, j))) {
                    ret += "*";
                }
                ret += " ";
            }
            ret += "\n";
        }
        System.out.println(ret);
    }

    public int runWithPrint(int xPos) {
        int x = xPos-1;
        for (int i = 0; i < height; i++) {
            printShapeWithStar(x, i);
            if(x-1 >= 0 && shape[i][x-1] == 1) {
                x--;
                printShapeWithStar(x, i);
            }
            else if (shape[i][x] == 1){
                x++;
                printShapeWithStar(x, i);
            }
        }
        return x+1;
    }
}