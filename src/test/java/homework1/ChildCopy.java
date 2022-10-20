package homework1;

import org.junit.jupiter.api.Test;

public class ChildCopy {
    @Test
        public void workingWithChild(){
        Child firstChild = new Child();
        firstChild.setAge(1);
        firstChild.setGender("Boy");
        firstChild.setName("Andrey");
        firstChild.setBloodType('+');

        Child secondChild = new Child();
        secondChild.setBloodType('-');
        secondChild.setName("Maxim");
        secondChild.setAge(5);
        secondChild.setHairColor("Blond");

        System.out.println("First Child:");
        System.out.println(firstChild.getAge());
        System.out.println(firstChild.getGender());
        System.out.println(firstChild.getBloodType());
        System.out.println(firstChild.getName());

        System.out.println("Second Child:");
        System.out.println(secondChild.getAge());
        System.out.println(secondChild.getBloodType());
        System.out.println(secondChild.getName());

    }
}
