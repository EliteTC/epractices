package model.repository;

import model.entity.Accessory;

import java.util.ArrayList;
import java.util.List;

public class AccessoriesRepo {
   public static List<Accessory> accessories = new ArrayList<>();

    static {
        accessories.add(new Accessory("string", 5.0));
        accessories.add(new Accessory("wrapper", 7.0));
    }
}
