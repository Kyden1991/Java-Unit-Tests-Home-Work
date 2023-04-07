package com.example.lions;

import com.example.Feline;
import com.example.Lion;
import com.example.Predator;

import java.util.List;

public class Alex extends Lion {
    final Predator predator;

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
        this.predator = feline;
    }

    
    public int getKittens() {
        return super.getKittens(0);
    }

    @Override
    public boolean doesHaveMane() {
        return super.doesHaveMane();
    }

    @Override
    public List<String> getFood() throws Exception {
        return super.getFood();
    }

    public List<String> getFriends(String zebraName, String hippopotamusName, String giraffeName) {
        return getFriends("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
