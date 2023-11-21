package com.example.lab67sataadis7web.data.main.animalsXML.animalsFactory;


import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Bird;
import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Fish;
import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Mammal;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;

public class SimpleAnimalFactory {
    public static Entity createAnimal (String type) {
        Entity animal = null;

        switch (type) {
            case "FISH":
                animal = new Fish();
                break;
            case "MAMMAL":
                animal = new Mammal();
                break;
            case "BIRD":
                animal = new Bird();
                break;
        }

        return animal;
    }
}
