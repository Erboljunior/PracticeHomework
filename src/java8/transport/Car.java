package java8.transport;

import java8.announcement.Announcement;

import java.time.LocalDate;

public class Car extends Announcement {

    private String colour;
    private LocalDate yearOfIssue;


    @Override
    public String toString() {
        return "Car{" +
                "Name = " + super.getName()+
                " | price = "+super.getPrice()+
                " | description = "+super.description+
                " | colour= " + colour +
                " | yearOfIssue=" + yearOfIssue +
                '}';
    }

    public Car(String name, String image, double price, String description, String colour, LocalDate yearOfIssue) {
        super(name, image, price, description);
        this.colour=colour;
        this.yearOfIssue=yearOfIssue;


    }
}