package com.example.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements IGame {
    @Override
    public void up() {
        System.out.println("SCUp");
    }

    @Override
    public void down() {
        System.out.println("SCDown");
    }

    @Override
    public void left() {
        System.out.println("SCLeft");
    }

    @Override
    public void right() {
        System.out.println("SCRight");
    }
}
