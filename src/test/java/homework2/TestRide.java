package homework2;

import org.junit.jupiter.api.Test;

public class TestRide {
    @Test
    public void checkRide() {
        Transport car = new Transport("Car", 60, 10);
        Transport train = new Transport("Train", 2000, 60);
        Transport plane = new Transport("Plain", 2500, 150);

        Roat roat1 = new Roat("Riga", "Vilnius", 295);
        Roat roat2 = new Roat("Riga", "Sochi", 2540);
        Roat roat3 = new Roat("Riga", "Kiev", 835);

        //FIRST ROAT
        System.out.println(roat1);
        // CAR ROUT
        System.out.print(" Car: " + roat1.getDistance() / 100 * car.getFuelConsuption() + " liters,");
        if (roat1.getDistance() / 100 * car.getFuelConsuption() <= car.getFuelTankCapacity()) {
            System.out.println(" Car can complete roat without refuel");
        } else {
            System.out.println(" Car can not complete roat without refuel");
        }
        //PLANE ROUT
        System.out.print(" Plane: " + roat1.getDistance() / 100 * plane.getFuelConsuption() + " liters,");
        if (roat1.getDistance() / 100 * plane.getFuelConsuption() <= plane.getFuelTankCapacity()) {
            System.out.println(" Plane can complete roat without refuel");
        } else {
            System.out.println(" Plane can not complete roat without refuel");
        }
        //TRAIN ROAT
        System.out.print(" Train: " + roat1.getDistance() / 100 * train.getFuelConsuption() + " liters,");
        if (roat1.getDistance() / 100 * train.getFuelConsuption() <= train.getFuelTankCapacity()) {
            System.out.println(" Train can complete roat without refuel");
        } else {
            System.out.println(" Train can not complete roat without refuel");
        }
        System.out.println("");

        // SECOND ROAT
        System.out.println(roat2);
        //CAR ROUT
        System.out.print(" Car: " + roat2.getDistance() / 100 * car.getFuelConsuption() + " liters,");
        if (roat2.getDistance() / 100 * car.getFuelConsuption() <= car.getFuelTankCapacity()) {
            System.out.println(" Car can complete roat without refuel");
        } else {
            System.out.println(" Car can not complete roat without refuel");
        }
        //PLANE ROUT
        System.out.print(" Plane: " + roat2.getDistance() / 100 * plane.getFuelConsuption() + " liters,");
        if (roat2.getDistance() / 100 * plane.getFuelConsuption() <= plane.getFuelTankCapacity()) {
            System.out.println(" Plane can complete roat without refuel");
        } else {
            System.out.println(" Plane can not complete roat without refuel");
        }
        //TRAIN ROUT
        System.out.print(" Train: " + roat2.getDistance() / 100 * train.getFuelConsuption() + " liters,");
        if (roat2.getDistance() / 100 * train.getFuelConsuption() <= train.getFuelTankCapacity()) {
            System.out.println(" Train can complete roat without refuel");
        } else {
            System.out.println(" Train can not complete roat without refuel");
        }
        System.out.println("");

        // THIERD ROAT
        System.out.println(roat3);
        //CAR ROUT
        System.out.print(" Car: " + roat3.getDistance() / 100 * car.getFuelConsuption() + " liters,");
        if (roat3.getDistance() / 100 * car.getFuelConsuption() <= car.getFuelTankCapacity()) {
            System.out.println(" Car can complete roat without refuel");
        } else {
            System.out.println(" Car can not complete roat without refuel");
        }
        //PLANE ROAT
        System.out.print(" Plane: " + roat3.getDistance() / 100 * plane.getFuelConsuption() + " liters,");
        if (roat3.getDistance() / 100 * plane.getFuelConsuption() <= plane.getFuelTankCapacity()) {
            System.out.println(" Plane can complete roat without refuel");
        } else {
            System.out.println(" Plane can not complete roat without refuel");
        }
        //TRAIN ROAT
        System.out.print(" Train: " + roat3.getDistance() / 100 * train.getFuelConsuption() + " liters,");
        if (roat3.getDistance() / 100 * train.getFuelConsuption() <= train.getFuelTankCapacity()) {
            System.out.println(" Train can complete roat without refuel");
        } else {
            System.out.println(" Train can not complete roat without refuel");
            }

        train.totalTransportDistance();
        System.out.println("Transport total distance " + car.totalTransportDistance2());
        if (roat2.getDistance() <= car.totalTransportDistance2()) {
            System.out.println("Can complete");
        }else {
            System.out.println("Can not complete");
        }
        }
        }
