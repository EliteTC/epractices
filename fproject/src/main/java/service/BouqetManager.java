package service;

import model.entity.Bouquet;
import model.entity.Flower;
import util.FreshnessComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BouqetManager {

    public static void sortByFreshness(Bouquet b){
        Collections.sort(b.getFlowers(),new FreshnessComparator());
    }

    public static ArrayList<Flower> getFlowerByStemHeight(Bouquet b,int lo,int hi){
        ArrayList<Flower> flowers = new ArrayList<>();
        for(Flower f : b.getFlowers()){
            if(f.getStemHeight() >= lo && f.getStemHeight() <= hi) flowers.add(f);
        }
        return flowers;
    }
}
