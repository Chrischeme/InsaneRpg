package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import java.util.Random;

public enum WeaponGemPrimaryAttribute {
    FlatStr, FlatInt, FlatDex, FlatVit, FlatPhysicalDamage, FlatMagicalDamage;
    private static int _minCoreStat = 1;
    private static int _maxCoreStat = 5;
    private static int _minFlatPhysicalDamage = 3;
    private static int _maxFlatPhysicalDamage = 10;
    private static int _minFlatMagicalDamage = 6;
    private static int _maxFlatMagicalDamage = 20;

    private static WeaponGemPrimaryAttribute[] _primaryAttribute = new WeaponGemPrimaryAttribute[]{FlatStr, FlatInt, FlatDex, FlatVit, FlatPhysicalDamage,FlatMagicalDamage};
    private static Random _randNum = new Random();

    public static WeaponGemPrimaryAttribute getRandomPrimaryAttribute() {
        //todo: replace java.util.Random with an actual random function
        return _primaryAttribute[_randNum.nextInt(_primaryAttribute.length)];
    }

    public static int getRandomPrimaryAttributeBonus(WeaponGemPrimaryAttribute attribute) {
        //todo: replace java.util.Random with an actual random function
        int statBonus;
        switch (attribute) {
            case FlatStr:
            case FlatInt:
            case FlatDex:
            case FlatVit:
                statBonus = (_minCoreStat + _randNum.nextInt(_maxCoreStat - _minCoreStat));
                break;
            case FlatPhysicalDamage:
                statBonus = (_minFlatPhysicalDamage + _randNum.nextInt(_maxFlatPhysicalDamage - _minFlatPhysicalDamage));
                break;
            default:
                statBonus = (_minFlatMagicalDamage + _randNum.nextInt(_maxFlatMagicalDamage - _minFlatMagicalDamage));
                break;
        }
        return statBonus;
    }
}
