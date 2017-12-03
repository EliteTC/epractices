package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private int height;
    private double price;
    private List<Flower> flowers;
    private List<Accessory> accessories;


    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();

    }

    public Bouquet( List<Flower> flowers, List<Accessory> accessories) {
        this.accessories = new ArrayList<>();
        this.flowers = flowers;
        this.accessories = accessories;
        this.height = calculateHeight();
        this.price = calculatePrice();
    }

    public Bouquet(List<Flower> flowers) {
        this.flowers = flowers;
        this.accessories = new ArrayList<>();
        this.height = calculateHeight();
        this.price = calculatePrice();
    }


    private int calculateHeight(){

        for(Flower f : this.getFlowers()){
            if(f.getStemHeight() > height) height = f.getStemHeight();
        }
        return height;
    }

    private double calculatePrice(){

        for(Flower f : this.getFlowers()){
            price+=f.getPrice();
        }
        for(Accessory a : this.getAccessories()){
            price+=a.getPrice();
        }
        return price;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Bouquet addFlower(Flower flower){
        this.flowers.add(flower);
        this.calculatePrice();
        this.calculateHeight();
        return this;
    }
    public Bouquet addAccessories(Accessory accessory){
        this.accessories.add(accessory);
        this.calculatePrice();
        return this;
    }

    public Bouquet removeFlower(Flower flower){
        this.flowers.remove(flower);
        this.calculatePrice();
        this.calculateHeight();
        return this;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "height=" + height +
                ", price=" + price +
                ", flowers=" + flowers +
                ", accessories=" + accessories +
                '}';
    }
}
