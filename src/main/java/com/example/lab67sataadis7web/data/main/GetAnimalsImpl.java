package com.example.lab67sataadis7web.data.main;

import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import com.example.lab67sataadis7web.data.main.animalsXML.XMLReader;

import java.util.List;

public class GetAnimalsImpl implements GetAnimals {
    private static GetAnimalsImpl INSTANCE;
    public static GetAnimalsImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (GetAnimalsImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GetAnimalsImpl();
                }
            }
        }
        return INSTANCE;
    }
    @Override
    public List<Entity> getAnimals() {
        XMLReader reader = XMLReader.getInstance();
        reader.readXML();
        return reader.getAnimals();
    }
}