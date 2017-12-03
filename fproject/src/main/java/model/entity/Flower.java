package model.entity;

import model.Freshness;

public class Flower {
    private String name;
    private int stemHeight;
    private double price;
    private Freshness freshness;



    public Flower(String name, int stemHeight, double price, Freshness freshness) {
        this.name = name;
        this.stemHeight = stemHeight;
        this.price = price;
        this.freshness = freshness;
    }

    public void setStemHeight(int stemHeight) {
        this.stemHeight = stemHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStemHeight() {
        return stemHeight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", stemHeight=" + stemHeight +
                ", price=" + price +
                ", freshness=" + freshness +
                '}';
    }
}
