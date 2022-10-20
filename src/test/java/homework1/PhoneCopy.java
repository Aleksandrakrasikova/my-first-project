package homework1;

import org.junit.jupiter.api.Test;

public class PhoneCopy {
    @Test
        public void WorkingWithPhone(){
        Phone Iphone = new Phone();
        Iphone.setColor("Deep Purple");
        Iphone.setPrice(1399.99);
        Iphone.setWeight(355.78f);

        Phone Galaxy = new Phone();
        Galaxy.setPrice(1000.99);
        Galaxy.setColor("Deep Blue");
        Galaxy.setSoftwareVersion(15.1);

        System.out.println("Iphone:");
        System.out.println(Iphone.getColor());
        System.out.println(Iphone.getPrice());
        System.out.println("Galaxy");
        System.out.println(Galaxy.getPrice());
        System.out.println(Galaxy.getColor());
    }
}
