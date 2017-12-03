package model.repository;

import model.entity.Bouquet;
import model.entity.Flower;

import java.util.*;

public class BouquetRepo {
   public  static List<Bouquet> bouquets = new ArrayList<>();

    static{
        bouquets.add(new Bouquet().addFlower(FlowersRepo.flowers.get(0)).addFlower(FlowersRepo.flowers.get(0))
                                             .addFlower(FlowersRepo.flowers.get(1))
                                             .addAccessories(AccessoriesRepo.accessories.get(0))
                                             .addAccessories(AccessoriesRepo.accessories.get(1)));
        bouquets.add(new Bouquet().addFlower(FlowersRepo.flowers.get(2)).addFlower(FlowersRepo.flowers.get(2))
                .addFlower(FlowersRepo.flowers.get(3))
                .addAccessories(AccessoriesRepo.accessories.get(0)));
    }
}
