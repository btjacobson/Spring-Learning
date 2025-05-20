package com.example.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements IGame{

    @Override
    public void up() {
        System.out.println("PUp");
    }

    @Override
    public void down() {
        System.out.println("PDown");
    }

    @Override
    public void left() {
        System.out.println("PLeft");
    }

    @Override
    public void right() {
        System.out.println("PRight");
    }
}
