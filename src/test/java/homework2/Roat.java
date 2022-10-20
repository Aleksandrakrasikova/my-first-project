package homework2;

public class Roat {

    private String start;
    private String finish;
    private double distance;

    public Roat(String roatStart, String roatFinish, double roatDistance) {
        start = roatStart;
        finish = roatFinish;
        distance = roatDistance;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public String toString() {
        return " from " + start + " to " + finish + " total distance is " + distance + " km";

    }
}
