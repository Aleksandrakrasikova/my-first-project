package homework1;

import org.junit.jupiter.api.Test;

public class ClockCopy {
    @Test
        public void WorkingWithClock (){
        Clock firstClock = new Clock();
        firstClock.setMaterial("Metal");
        firstClock.setPrice(200);

        Clock secondClock = new Clock();
        secondClock.setDesigner("Apple");

        System.out.println("First clock:");
        System.out.println(firstClock.getMaterial());
        System.out.println(firstClock.getPrice());
        System.out.println("Second Clock");
        System.out.println(secondClock.getDesigner());


    }
}
