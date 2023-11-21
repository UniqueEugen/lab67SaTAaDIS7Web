import com.example.lab67sataadis7web.data.main.GetAnimalsImpl;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AnimalsCallTest {
    private List<Entity> animals;

    @Order(1)
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void checkTime(){
        try {
            animals = GetAnimalsImpl.getInstance().getAnimals();
            animals.forEach(animal-> animal.toString());
        }catch (Exception e){
            fail(e);
        }
    }

    @Test
    @Order(2)
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void checkFish(){
        try {
            animals = GetAnimalsImpl.getInstance().getAnimals();
            animals.forEach(animal -> {
                if (animal.getType().equals("FISH")){
                    if(!animal.move().equals("I'm swimming!")) throw new RuntimeException("Wrong answer!");
                }
            });
        }catch (Exception e){
            fail(e);
        }
    }
}
