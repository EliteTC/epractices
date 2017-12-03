package model.repository;

import model.Freshness;
import model.entity.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowersRepo {

  public  static List<Flower> flowers = new ArrayList<>();

    static {
        flowers.add(new Flower("rose",20,50, Freshness.HIGH));
        flowers.add(new Flower("chamomile",5,10, Freshness.HIGH));
        flowers.add(new Flower("chrysanthemum",10,20, Freshness.FADED));
        flowers.add(new Flower("poppy",5,15, Freshness.MEDIUM));
        flowers.add(new Flower("dandelion",7,3, Freshness.LOW));

    }
}
