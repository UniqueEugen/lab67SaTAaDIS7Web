package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities;


import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy.FishMoveStrategy;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;

public class Fish extends Entity {
    public Fish(){this.setMoveStrategy(new FishMoveStrategy());}
}
