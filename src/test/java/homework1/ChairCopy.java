package homework1;

import org.junit.jupiter.api.Test;

public class ChairCopy {
@Test
        public void WorkingWithChair (){
        Chair firstChair = new Chair ();
        firstChair.setColor("Grey");
        firstChair.setMaterial("Textile");
        firstChair.setHeight(250.75);

        Chair secondChair = new Chair ();
        secondChair.setWeight("45 kg");
        secondChair.setColor("Green");
        secondChair.setManufactor("Ikea");

        Chair thirdChair = new Chair();
        thirdChair.setMaterial("Leather");
        thirdChair.setColor("Blue");
        thirdChair.setManufactor("Awax");

        System.out.println("Hello");
        System.out.println("First chair:");
        System.out.println(firstChair.getColor());
        System.out.println(firstChair.getMaterial());
        System.out.println("Second chair:");
        System.out.println(secondChair.getWeight());
        System.out.println(secondChair.getManufactor());
        System.out.println("Third chair:");
        System.out.println(thirdChair.getColor());
        System.out.println(thirdChair.getManufactor());


    }
}
