package org.example;

import org.example.ver2.Game;
import org.example.ver2.LadderBasicCreator;
import org.example.ver2.LadderRandomCreator;
import org.example.ver2.User;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Game game1 = new Game(new LadderBasicCreator());

        user.makeLadder(game1, 3, 3);
        user.drawHorizontalLine(game1, 1, 1);
        user.print(game1);
        System.out.println(user.runGame(game1, 1));
        System.out.println();

        Game game2 = new Game(new LadderRandomCreator());
        user.makeLadder(game2, 5, 5);
        user.print(game2);
    }
}