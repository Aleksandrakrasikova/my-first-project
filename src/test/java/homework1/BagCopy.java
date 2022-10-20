package homework1;

import org.junit.jupiter.api.Test;

public class BagCopy {
    @Test
        public void WorkingWithBags() {
        Bag firstBag = new Bag ();
        firstBag.setColor("Black");
        firstBag.setDepth(30.50);
        firstBag.setDesigner("Chanel");
        firstBag.setMaterial("Leather");
        firstBag.setPrice(3500.50f);

        Bag secondBag = new Bag();
        secondBag.setPrice(59.99f);
        secondBag.setMaterial("Suede leather");
        secondBag.setDepth(150.65);
        secondBag.setDesigner("Zara");
        secondBag.setColor("Brown");

        System.out.println("Hello");
        System.out.println("First bag");
        System.out.println(firstBag.getColor());
        System.out.println(firstBag.getDesigner());
        System.out.println(firstBag.getPrice());

        System.out.println("Second bag");
        System.out.println(secondBag.getColor());
        System.out.println(secondBag.getDesigner());
        System.out.println(secondBag.getPrice());
    }



}
