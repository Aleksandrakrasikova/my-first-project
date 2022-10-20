package homework1;

import org.junit.jupiter.api.Test;

public class ToyCopy {
@Test
        public void WorkingWithToy(){

        Toy rabbit = new Toy();
        rabbit.setMaterial("textile");
        rabbit.setPrice(24.99f);
        rabbit.setDesigner("Fisher Price");

        Toy car = new Toy();
        car.setMaterial("metal");
        car.setWeight(180.5);
        car.setDesigner("John Deer");
        car.setPrice(47.59f);

        System.out.println("Rabbit:");
        System.out.println(rabbit.getDesigner());
        System.out.println(rabbit.getPrice());
        System.out.println("Car");
        System.out.println(car.getDesigner());
        System.out.println(car.getPrice());
    }
}
