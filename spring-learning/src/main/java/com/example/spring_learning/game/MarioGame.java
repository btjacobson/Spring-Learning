package com.example.spring_learning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements IGame {
    @Override
    public void up() {
        System.out.println("MUp");
    }

    @Override
    public void down() {
        System.out.println("MDown");
    }

    @Override
    public void left() {
        System.out.println("MLeft");
    }

    @Override
    public void right() {
        System.out.println("MRight");
    }
}
