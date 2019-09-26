package pojoImpl;

import org.springframework.stereotype.Component;
import pojo.Animal;

@Component
public class Dog implements Animal {

    public void use() {
        System.out.println("狗 "+Dog.class.getSimpleName()+"用来看门");
    }
}
