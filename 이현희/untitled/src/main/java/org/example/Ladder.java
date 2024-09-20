package org.example;

public class Ladder {
    private LadderBoard board;

    public Ladder(int numberOfPeople, int height) {
        board = new LadderBoard(numberOfPeople, height);
    }

    //왼쪽에서 오른쪽으로 그어
    public void drawLine(int xPos, int yPos) {
        if(xPos == board.getNumberOfPeople() || yPos == board.getHeight() || yPos == 1)
            return;
        if(xPos == 1) {
            if(!board.isLineExist(xPos+1, yPos))
                board.addLine(xPos, yPos);
            return;
        }
        if(xPos == board.getNumberOfPeople()-1) {
            if(!board.isLineExist(xPos-1, yPos))
                board.addLine(xPos, yPos);
            return;
        }
        if(board.isLineExist(xPos-1, yPos))
            return;
        if(board.isLineExist(xPos+1, yPos))
            return;
        board.addLine(xPos, yPos);
    }

    public int run(int xPos) {
        int currentXPos = xPos;
        for (int yPos = 1; yPos < board.getHeight() + 1; yPos++) {
            if(currentXPos >= 2 && board.isLineExist(currentXPos-1, yPos))
                currentXPos--;
            else if(board.isLineExist(currentXPos, yPos))
                currentXPos++;
            System.out.println(currentXPos);
        }
        return currentXPos;
    }

    public int getPosValue(int xPos, int yPos) {
        return board.isLineExist(xPos, yPos) ? 1 : 0;
    }

    public void printShape() {
        StringBuilder ret = new StringBuilder();
        for (int yPos = 1; yPos < board.getHeight() + 1; yPos++) {
            for (int xPos = 1; xPos < board.getNumberOfPeople() + 1; xPos++) {
                ret.append(getPosValue(xPos, yPos)).append(" ");
            }
            ret.append("\n");
        }
        System.out.println(ret);
    }

    private void printShapeWithStar(int xPos, int yPos) {
        Position pos = new Position(xPos, yPos);

        StringBuilder ret = new StringBuilder();
        for (int y = 1; y < board.getHeight() + 1; y++) {
            for (int x = 1; x < board.getNumberOfPeople() + 1; x++) {
                ret.append(getPosValue(x, y));
                if(pos.equals(new Position(x, y)))
                    ret.append("*");
                ret.append(" ");
            }
            ret.append("\n");
        }
        System.out.println(ret);
    }

    public int runWithPrint(int xPos) {
        int currentXPos = xPos;
        for (int i = 1; i < board.getHeight() + 1; i++) {
            printShapeWithStar(currentXPos, i);
            if(currentXPos >= 2 && board.isLineExist(currentXPos-1, i)) {
                currentXPos--;
                printShapeWithStar(currentXPos, i);
            }
            else if (board.isLineExist(currentXPos, i)){
                currentXPos++;
                printShapeWithStar(currentXPos, i);
            }
        }
        return currentXPos;
    }
}