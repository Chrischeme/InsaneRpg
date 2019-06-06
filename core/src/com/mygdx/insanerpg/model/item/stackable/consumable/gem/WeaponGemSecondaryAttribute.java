package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import java.util.Random;

public enum WeaponGemSecondaryAttribute {
    PercentCritChance,PercentPhysicalDamage,PercentMagicalDamage,PercentStr,PercentInt,PercentDex,PercentVit,
    PercentMoveSpeed,PercentLifesteal;

    private static WeaponGemSecondaryAttribute[] _secondaryAttribute = new WeaponGemSecondaryAttribute[]{
            PercentCritChance, PercentPhysicalDamage,PercentMagicalDamage,PercentStr,PercentInt,PercentDex,PercentVit,
            PercentMoveSpeed,PercentLifesteal};

    private static double _minBonus = 0.01;
    private static double _maxBonus = 0.05;

    private static Random _randNum = new Random();

    public static WeaponGemSecondaryAttribute getRandomSecondaryAttribute() {
        //To Do: replace java.util.Random with an actual random function
        return _secondaryAttribute[_randNum.nextInt(_secondaryAttribute.length)];
    }

    public static double getRandomSecondaryAttributeBonus() {
        //To Do: replace java.util.Random with an actual random function
        return (_minBonus+ (double)((_randNum.nextInt((int)((_maxBonus-_minBonus)*100)))/100));
    }
}
