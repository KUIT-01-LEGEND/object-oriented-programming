package org.example.ver2;

public class Line {
    private boolean isLineDrawed;
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
