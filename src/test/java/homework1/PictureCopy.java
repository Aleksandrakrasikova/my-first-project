package homework1;

import org.junit.jupiter.api.Test;

public class PictureCopy {
@Test
        public void WorkingWithPicture (){
        Picture canva = new Picture();
        canva.setPrice(59.99f);
        canva.setWidth(75.5);
        canva.setLength(140.5);

        Picture photo = new Picture();
        photo.setPrice(3.95f);
        photo.setFrame(false);

        System.out.println("Canva:");
        System.out.println(canva.getPrice());
        System.out.println("Photo:");
        System.out.println(photo.isFrame());
        System.out.println(photo.getPrice());


    }
}
