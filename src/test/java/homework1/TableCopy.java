package homework1;


import org.junit.jupiter.api.Test;

public class TableCopy {
@Test
        public void WorkingWithTable (){

        Table coffeeTable = new Table();
        coffeeTable.setMaterial("wood");
        coffeeTable.setPrice(168.45f);
        coffeeTable.setShape("circle");

        Table officeTable = new Table();
        officeTable.setMaterial("Plastic");
        officeTable.setColor("white");
        officeTable.setLegCount(4);

        System.out.println("Coffee Table:");
        System.out.println(coffeeTable.getShape());
        System.out.println(coffeeTable.getMaterial());
        System.out.println("Office Table:");
        System.out.println(officeTable.getLegCount());
        System.out.println(officeTable.getColor());
    }
}
