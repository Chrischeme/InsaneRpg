package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import java.util.Random;

public enum WeaponGemPrimaryAttribute {
    FlatStr, FlatInt, FlatDex, FlatVit;
    private static int _minBonus = 1;
    private static int _maxBonus = 5;

    private static WeaponGemPrimaryAttribute[] _primaryAttribute = new WeaponGemPrimaryAttribute[]{FlatStr, FlatInt, FlatDex, FlatVit};
    private static Random _randNum = new Random();

    public static WeaponGemPrimaryAttribute getRandomPrimaryAttribute() {
        //To Do: replace java.util.Random with an actual random function
        return _primaryAttribute[_randNum.nextInt(_primaryAttribute.length)];
    }

    public static int getRandomPrimaryAttributeBonus() {
        //To Do: replace java.util.Random with an actual random function
        return (_minBonus + _randNum.nextInt(_maxBonus - _minBonus));
    }
}
