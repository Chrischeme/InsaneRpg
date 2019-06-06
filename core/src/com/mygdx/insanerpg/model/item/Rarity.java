package com.mygdx.insanerpg.model.item;

import java.util.Random;

public enum Rarity {
    COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, GODLY;

    private static double _commonDropRate = 0.90;
    private static double _uncommonDropRate = 0.09;
    private static double _rareDropRate = 0.0099;
    private static double _epicDropRate = 0.0001;
    private static Random _randNum = new Random();

    public static Rarity getRandomRarity() {
        //To Do: replace java.util.Random with an actual random function
        if (_randNum.nextInt(10000) <= _epicDropRate * 10000) {
            return Rarity.EPIC;
        } else if (_randNum.nextInt(10000) <= _rareDropRate * 10000) {
            return Rarity.RARE;
        } else if (_randNum.nextInt(10000) <= _uncommonDropRate * 10000) {
            return Rarity.UNCOMMON;
        } else {
            return Rarity.COMMON;
        }
    }
}
