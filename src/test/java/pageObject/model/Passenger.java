package pageObject.model;

public class Passenger {
    private String firstName;
    private String lastName;
    private String discount;
    private int peopleCount;
    private int childrenCount;
    private int bagCount;
    private String date;

    public Passenger(String firstName, String lastName, String discount, int peopleCount, int childrenCount, int bagCount, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.discount = discount;
        this.peopleCount = peopleCount;
        this.childrenCount = childrenCount;
        this.bagCount = bagCount;
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDiscount() {
        return discount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public int getBagCount() {
        return bagCount;
    }

    public String getDate() {
        return date;
    }
}
