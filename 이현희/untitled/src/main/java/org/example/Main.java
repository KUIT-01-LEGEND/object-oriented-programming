package org.example;

import org.example.ver2.*;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Game game1 = LadderGameFactory.createBasicLadderGame();

        user.makeLadder(game1, 3, 3);
        user.drawHorizontalLine(game1, 1, 1);
        user.print(game1);
        System.out.println("startColumn : 1");
        System.out.println(user.runGame(game1, 1));
        System.out.println();

        Game game2 = LadderGameFactory.createRandomLadderGame();
        user.makeLadder(game2, 5, 5);
        user.print(game2);
        System.out.println("startColumn : 1");
        System.out.println(user.runGame(game2, 1));
    }
}