package com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities;

import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy.BirdMoveStrategy;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import lombok.Data;


public class Bird extends Entity {
    public Bird() {
        this.setMoveStrategy(new BirdMoveStrategy());
    }
}
