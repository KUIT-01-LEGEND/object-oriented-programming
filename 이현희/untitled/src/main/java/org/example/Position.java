package org.example;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isXEqual(int x) {
        return this.x == x;
    }

    public boolean isYEqual(int y) {
        return this.y == y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof Position))
            return false;
        Position p = (Position) obj;
        return p.isXEqual(this.x) && p.isYEqual(this.y);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.x + this.y);
    }
}
