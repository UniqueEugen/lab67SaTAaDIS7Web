package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities;


import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy.MammalMoveStrategy;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;

public class Mammal extends Entity {
    public Mammal(){this.setMoveStrategy(new MammalMoveStrategy());}
}
