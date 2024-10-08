package org.example.ver2;

public class LadderGameFactory {
    public static Game createRandomLadderGame() {
        return new Game(new LadderRandomCreator());
    }
    public static Game createBasicLadderGame() {
        return new Game(new LadderBasicCreator());
    }
}
