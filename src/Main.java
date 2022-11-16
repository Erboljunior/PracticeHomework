import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone phone1 = new Phone("Samsung", "", 20000, "new", "China", 128);
        Phone phone2 = new Phone("Apple", "", 20000, "new", "China", 64);
        Phone[] phones = {phone1, phone2};

        Home home1 = new Home("Ihlas", "", 20000, "old", "1Xroom", 9);
        Home home2 = new Home("Action", "", 20000, "old", "1Xroom", 11);
        Home[] homes = {home1, home2};

        Laptop laptop1 = new Laptop("Lenovo", "", 20000, "old", "Windows");
        Laptop laptop2 = new Laptop("Macbook", "", 20000, "new", "MacOs");
        Laptop[] laptops = {laptop1, laptop2};

        Car car1 = new Car("Fit", "", 20000, "old", "white", LocalDate.of(2013, 4, 17));
        Car car2 = new Car("Mazda", "", 20000, "old", "black", LocalDate.of(2008, 11, 22));
        Car[] cars = {car1, car2};

        Announcement[] announcements = {car1, car2, phone1, phone2, home1, home2, laptop1, laptop2};
        findByPrice(scanner.nextInt(), announcements);


    }

    public static void findByPrice (double price, Announcement[]announcements){
            for (Announcement announcement : announcements) {
                if(announcement.getPrice()==price){
                    System.out.println(announcement);
                }

            }



            }

            }









