package ladder;

public class Position {
    private int x;

    public Position(int y, int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void moveToLeft(){
        this.x--;
    }

    public void moveToRight(){
        this.x++;
    }
}
