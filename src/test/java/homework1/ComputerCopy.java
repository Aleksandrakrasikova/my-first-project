package homework1;

import org.junit.jupiter.api.Test;

public class ComputerCopy {
@Test
        public void WorkingWithComputer (){
        Computer firstComputer = new Computer();
        firstComputer.setColor("Grey");
        firstComputer.setManufactor("Apple");
        firstComputer.setMac(true);

        Computer secondComputer = new Computer();
        secondComputer.setScreenSize(13.5);
        secondComputer.setManufactor("Acer");
        secondComputer.setMac(false);

        System.out.println("First Computer:");
        System.out.println(firstComputer.getManufactor());
        System.out.println(firstComputer.isMac());
        System.out.println("Second Computer");
        System.out.println(secondComputer.isMac());
        System.out.println(secondComputer.getManufactor());

    }
}
