package homework1;

import org.junit.jupiter.api.Test;


public class PenCopy {
    @Test
        public void WorkingWithPen(){
        Pen firstPen = new Pen();
        firstPen.setColor("Red");
        firstPen.setIncColor("Black");
        firstPen.setManufactor("Parker");

        Pen secondPen = new Pen();
        secondPen.setLength(10.5);
        secondPen.setPrice(3.99f);
        secondPen.setIncColor("Blue");

        System.out.println("First Pen:");
        System.out.println(firstPen.getIncColor());
        System.out.println(firstPen.getManufactor());
        System.out.println("Second Pen:");
        System.out.println(secondPen.getPrice());
        System.out.println(secondPen.getIncColor());

    }
}
