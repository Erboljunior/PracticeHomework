package java8.home;

import java8.announcement.Announcement;

public class Home extends Announcement {
    private String homeType;
    private int maxguest;


    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public int getMaxguest() {
        return maxguest;
    }

    public void setMaxguest(int maxguest) {
        this.maxguest = maxguest;
    }




    @Override
    public String toString() {
        return  "Home{" +
                "Name = " + super.getName()+
                " | price = " + super.getPrice() +
                " | description = "+super.description +
                " | homeType = " + homeType +
                " | maxguest =" + maxguest +
                '}';
    }

    public Home(String name, String image, double price, String description, String homeType, int maxguest) {
        super(name, image, price, description);
        this.homeType = homeType;
        this.maxguest = maxguest;





    }

}
