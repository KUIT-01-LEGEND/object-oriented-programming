package org.example.ver2;

public class Line {
    private boolean isLineDrawed;
    public Line() {
        isLineDrawed = false;
    }
    public boolean drawLine() {
        if(isLineDrawed) {
            return false;
        } else {
            isLineDrawed = true;
            return true;
        }
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
