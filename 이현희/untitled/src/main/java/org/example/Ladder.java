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

    public int getPosValue(int x, int y) {
        return shape[y-1][x-1];
    }


    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int x, int y) {
        if(y == 1 || y == height)
            return;
        if(x == numberOfPeople)
            return;
        if(x == 1) {
            if(shape[y-1][x] != 1)
                shape[y - 1][x - 1] = 1;
            return;
        }
        if(x == numberOfPeople-1) {
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

    public void run(int xPos) {
//        int x = xPos;
//        for (int i = 0; i < height; i++) {
//            if(shape[i][x] == 1)
//                x
//        }
    }
}
