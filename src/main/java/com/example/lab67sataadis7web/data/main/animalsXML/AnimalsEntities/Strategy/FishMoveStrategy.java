package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy;



public class FishMoveStrategy implements MoveStrategy{
    @Override
    public String move() {
        System.out.println("I'm swimming");
        return "I'm swimming!";
    }
}
