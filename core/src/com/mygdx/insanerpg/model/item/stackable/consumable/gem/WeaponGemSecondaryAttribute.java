package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import java.util.Random;

public enum WeaponGemSecondaryAttribute {
    PercentCritChance, PercentPhysicalDamage, PercentMagicalDamage, PercentStr, PercentInt, PercentDex, PercentVit,
    PercentMoveSpeed, PercentLifeSteal, PercentSpellVamp;

    private static WeaponGemSecondaryAttribute[] _secondaryAttribute = new WeaponGemSecondaryAttribute[]{
            PercentCritChance, PercentPhysicalDamage, PercentMagicalDamage, PercentStr, PercentInt, PercentDex, PercentVit,
            PercentMoveSpeed, PercentLifeSteal, PercentSpellVamp};

    private static double _minPercentCoreStat = 1.0;
    private static double _maxPercentCoreStat = 3.0;
    private static double _minPercentCritChance = 1.0;
    private static double _maxPercentCritChance = 3.0;
    private static double _minPercentPhysicalDamage = 1.0;
    private static double _maxPercentPhysicalDamage = 3.0;
    private static double _minPercentMagicalDamage = 1.0;
    private static double _maxPercentMagicalDamage = 30;
    private static double _minPercentMoveSpeed = 2.0;
    private static double _maxPercentMoveSpeed = 5.0;
    private static double _minPercentLifeSteal = 1.0;
    private static double _maxPercentLifeSteal = 3.0;
    private static double _minPercentSpellVamp = 1.0;
    private static double _maxPercentSpellVamp = 3.0;


    private static Random _randNum = new Random();

    public static WeaponGemSecondaryAttribute getRandomSecondaryAttribute() {
        //todo: replace java.util.Random with an actual random function
        return _secondaryAttribute[_randNum.nextInt(_secondaryAttribute.length)];
    }

    public static double getRandomSecondaryAttributeBonus(WeaponGemSecondaryAttribute attribute) {
        //todo: replace java.util.Random with an actual random function
        double statBonus;
        switch (attribute) {
            case PercentStr:
            case PercentInt:
            case PercentDex:
            case PercentVit:
                statBonus = (_minPercentCoreStat) + ((double) _randNum.nextInt((int) (_maxPercentCoreStat - _minPercentCoreStat)));
                break;
            case PercentCritChance:
                statBonus = (_minPercentCritChance + ((double) _randNum.nextInt((int) (_maxPercentCritChance - _minPercentCritChance))));
                break;
            case PercentMoveSpeed:
                statBonus = (_minPercentMoveSpeed + ((double) _randNum.nextInt((int) (_maxPercentMoveSpeed - _minPercentMoveSpeed))));
                break;
            case PercentLifeSteal:
                statBonus = (_minPercentLifeSteal + ((double) _randNum.nextInt((int) (_maxPercentLifeSteal - _minPercentLifeSteal))));
                break;
            case PercentSpellVamp:
                statBonus = (_minPercentSpellVamp + ((double) _randNum.nextInt((int) (_maxPercentSpellVamp - _minPercentSpellVamp))));
                break;
            case PercentPhysicalDamage:
                statBonus = (_minPercentPhysicalDamage + ((double) _randNum.nextInt((int) (_maxPercentPhysicalDamage - _minPercentPhysicalDamage))));
                break;
            default:
                statBonus = (_minPercentMagicalDamage + ((double) _randNum.nextInt((int) (_maxPercentMagicalDamage - _minPercentMagicalDamage))));
                break;
        }
        return statBonus;
    }
}
