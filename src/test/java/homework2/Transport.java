package homework2;

public class Transport {

    private String type;
    private int fuelTankCapacity;
    private double fuelConsuption;


    public Transport(String transportType, int transportFuelTankCapacity, double transportFuelConsuption) {
        type = transportType;
        fuelTankCapacity = transportFuelTankCapacity;
        fuelConsuption = transportFuelConsuption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(double fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public void totalTransportDistance () {
        double x = fuelTankCapacity * 100 / fuelConsuption;
        System.out.println("Total transport distance " + x);

    }
    public double totalTransportDistance2(){
        double x = fuelTankCapacity * 100 / fuelConsuption;
        return x;
    }
}
