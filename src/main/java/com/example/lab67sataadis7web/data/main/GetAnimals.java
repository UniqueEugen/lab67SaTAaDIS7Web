package com.example.lab67sataadis7web.data.main;


import com.example.lab67sataadis7web.data.main.animalsXML.Entity;

import java.util.List;

public interface GetAnimals {
    public List<Entity> getAnimals();
    public Entity getAnimal(String id);
}
