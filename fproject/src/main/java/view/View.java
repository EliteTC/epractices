package view;

import static model.repository.AccessoriesRepo.*;
import static model.repository.BouquetRepo.*;
import static model.repository.FlowersRepo.*;

public class View {
    public static void print(Object message){
        System.out.println(message);
    }
    public static void printAccessories(){
        for(int i=0; i< accessories.size();i++){
            System.out.println(i + " - "+ accessories.get(i));
        }
    }
    public static void printBooqets(){
        for(int i=0; i< bouquets.size();i++){
            System.out.println(i + " - "+ bouquets.get(i));
        }
    }
    public static void printFlowers(){
        for(int i=0; i< flowers.size();i++){
            System.out.println(i + " - "+ flowers.get(i));
        }
    }
}
