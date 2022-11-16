package java8.devices;

import java8.announcement.Announcement;

public class Laptop extends Announcement {
    private String operationSystem;

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "Name = " + super.getName() +
                " | price = " + super.getPrice() +
                " | description = " + super.description +
                " | operationSystem = " + operationSystem + '}';


}
    public Laptop(String name, String image, double price, String description, String operationSystem) {
        super(name, image, price, description);
        this.operationSystem=operationSystem;


    }
}