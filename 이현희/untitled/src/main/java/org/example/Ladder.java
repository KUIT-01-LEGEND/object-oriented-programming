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

    public int[][] getShape() {
        return shape;
    }


    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int x, int y) {
        if(y == 1 || y == height)
            return;
        if(x == numberOfPeople)
            return;
        shape[y-1][x-1] = 1;
    }

    public void run(int position) {
//        int x = position;
//        for (int i = 0; i < height; i++) {
//            if(shape[i][x] == 1)
//                x
//        }
    }
}
