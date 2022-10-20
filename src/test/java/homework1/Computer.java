package homework1;

public class Computer {
    //----ATTRIBUTES----
    private String manufactor;
    private boolean Mac;
    private int memoryStorage;
    private double screenSize;
    private String color;

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public boolean isMac() {
        return Mac;
    }

    public void setMac(boolean mac) {
        Mac = mac;
    }

    public int getMemoryStorage() {
        return memoryStorage;
    }

    public void setMemoryStorage(int memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
