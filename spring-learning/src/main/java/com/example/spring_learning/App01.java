package com.example.spring_learning;

import com.example.spring_learning.game.GameRunner;
import com.example.spring_learning.game.IGame;
import com.example.spring_learning.game.MarioGame;
import com.example.spring_learning.game.SuperContraGame;

public class App01 {

    public static void main(String[] args) {
        IGame gameOne = new MarioGame();
        IGame gameTwo = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(gameOne);

        gameRunner.run();
    }
}
