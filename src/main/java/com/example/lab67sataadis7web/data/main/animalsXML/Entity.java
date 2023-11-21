package com.example.lab67sataadis7web.data.main.animalsXML;
import com.example.lab67sataadis7web.data.main.animalsXML.AnimalsEntities.Strategy.MoveStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private UUID id;
    private String type;
    private double price;
    private String kind;
    private String description;
    private String subspecies;

    private MoveStrategy moveStrategy;
    public String move() {
        return moveStrategy.move();
    }
    @Override
    public String toString() {
        System.out.println( "id=" + getId()+"\nЖивотное [вид: " + getKind() + ", подвид: " + getSubspecies() +
                ", семейство: " + getType() + ", цена: " + getPrice() + "]\nОписание: "+getDescription());
        return null;
    }

    public String getId() {
        return id.toString();
    }

    public void setId(String id) {
        this.id = UUID.fromString(id);
    }

}
