package pojoImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.Animal;
import pojo.Person;

@Component
public class BussinessPerson implements Person {
    @Autowired
    private Animal animal;

    public void service() {
        this.animal.use();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
