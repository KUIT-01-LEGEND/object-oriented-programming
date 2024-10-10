package org.example;

import org.example.ver2.*;

public class Main {
    public static void main(String[] args) {
        User user = new User(GameFactory.createBasicLadderGame());

        user.makeLadder(3, 3);
        user.drawHorizontalLine(1, 1);
        user.print();
        System.out.println("startColumn : 1");
        System.out.println(user.runGame(1));
        System.out.println();

        user.setGame(GameFactory.createRandomLadderGame());
        user.makeLadder(5, 5);
        user.print();
        System.out.println("startColumn : 1");
        System.out.println(user.runGame(1));
    }
}