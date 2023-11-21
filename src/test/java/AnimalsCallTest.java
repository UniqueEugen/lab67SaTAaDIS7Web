import com.example.lab67sataadis7web.data.main.GetAnimals;
import com.example.lab67sataadis7web.data.main.GetAnimalsImpl;
import com.example.lab67sataadis7web.data.main.animalsXML.Entity;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AnimalsCallTest {
    private List<Entity> animals;

    @Order(2)
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
    @Order(3)
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
    @Test
    @Order(1)
    @Timeout(value = 30, unit = TimeUnit.MILLISECONDS)
    public void checkSingleton(){
        try{
            GetAnimals getAnimals = GetAnimalsImpl.getInstance();
            assertNotNull(getAnimals);
        }catch (Exception e){
            fail(e);
        }
    }
    @Test
    @Order(4)
    @Timeout(value = 30, unit = TimeUnit.MILLISECONDS)
    public void checkUniqueId(){
        try{
;
            AtomicReference<String> checkAnimalId = new AtomicReference<>("0");
            GetAnimalsImpl.getInstance().getAnimals().stream().forEach(animal -> {
                if(animal.getId().equals(checkAnimalId.get())){ fail("Non unique id");}
                else checkAnimalId.set(animal.getId());
            });
        }catch (Exception e){
            fail(e);
        }
    }
}
