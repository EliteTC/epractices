package util;

import model.entity.Flower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FreshnessComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Flower f1 = (Flower) o1, f2 = (Flower) o2;
        return f1.getFreshness().compareTo(f2.getFreshness());
    }
}
