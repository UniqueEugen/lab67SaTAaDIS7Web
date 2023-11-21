package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy;


public class BirdMoveStrategy implements MoveStrategy{
    @Override
    public String move() {
        System.out.println("I'm flying!");
        return "I'm flying!";
    }
}
