package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy;



public class MammalMoveStrategy implements MoveStrategy{
    @Override
    public String move() {
        System.out.println("I'm running!");
        return "I'm running";
    }
}
