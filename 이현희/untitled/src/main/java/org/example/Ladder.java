package org.example;

public class Ladder {
    private int[][] board;
    private int numberOfPeople;
    private int height;

    public Ladder(int numberOfPeople, int height) {
        board = new int[height][numberOfPeople];
    }

    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int xPos, int yPos) {
        if(xPos == numberOfPeople || yPos == height || yPos == 1)
            return;
        if(xPos == 1) {
            if(!isLineExist(xPos+1, yPos))
                addLine(xPos, yPos);
            return;
        }
        if(xPos == numberOfPeople-1) {
            if(!isLineExist(xPos-1, yPos))
                addLine(xPos, yPos);
            return;
        }
        if(isLineExist(xPos-1, yPos))
            return;
        if(isLineExist(xPos+1, yPos))
            return;
        addLine(xPos, yPos);
    }

    public int run(int xPos) {
        int currentXPos = xPos;
        for (int yPos = 1; yPos < height + 1; yPos++) {
            if(currentXPos >= 2 && isLineExist(currentXPos-1, yPos))
                currentXPos--;
            else if(isLineExist(currentXPos, yPos))
                currentXPos++;
            System.out.println(currentXPos);
        }
        return currentXPos;
    }

    public int runWithPrint(int xPos) {
        int currentXPos = xPos;
        for (int i = 1; i < height + 1; i++) {
            printShapeWithStar(currentXPos, i);
            if(currentXPos >= 2 && isLineExist(currentXPos-1, i)) {
                currentXPos--;
                printShapeWithStar(currentXPos, i);
            }
            else if (isLineExist(currentXPos, i)){
                currentXPos++;
                printShapeWithStar(currentXPos, i);
            }
        }
        return currentXPos;
    }

    public void printBoard() {
        StringBuilder ret = new StringBuilder();
        for (int yPos = 1; yPos < height + 1; yPos++) {
            for (int xPos = 1; xPos < numberOfPeople + 1; xPos++) {
                ret.append(getPosValue(xPos, yPos)).append(" ");
            }
            ret.append("\n");
        }
        System.out.println(ret);
    }

    public int getPosValue(int xPos, int yPos) {
        return isLineExist(xPos, yPos) ? 1 : 0;
    }

    private void printShapeWithStar(int xPos, int yPos) {
        Position pos = new Position(xPos, yPos);

        StringBuilder ret = new StringBuilder();
        for (int y = 1; y < height + 1; y++) {
            for (int x = 1; x < numberOfPeople + 1; x++) {
                ret.append(getPosValue(x, y));
                if(pos.equals(new Position(x, y)))
                    ret.append("*");
                ret.append(" ");
            }
            ret.append("\n");
        }
        System.out.println(ret);
    }

    private void addLine(int xPos, int yPos) {
        board[xPos-1][yPos-1] = 1;
    }

    private boolean isLineExist(int xPos, int yPos) {
        return board[xPos-1][yPos-1] == 1;
    }
}