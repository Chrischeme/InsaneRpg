package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import java.util.Random;

public abstract class WeaponGemAttribute {
    private static int _flatPhysicalDamage = 10;
    private static int _flatMagicalDamage = 10;
    private static int _flatStr = 5;
    private static int _flatInt = 5;
    private static int _flatDex = 5;
    private static int _flatVit = 5;
    private static int[] _primaryAttribute = new int[]{_flatPhysicalDamage, _flatMagicalDamage, _flatStr, _flatInt,
            _flatStr, _flatVit};
    private static double _critChance = 0.05;
    private static double _percentPhysicalDamage = 0.05;
    private static double _percentMagicalDamage = 0.05;
    private static double _percentStr = 0.02;
    private static double _percentInt = 0.02;
    private static double _percentDex = 0.02;
    private static double _percentVit = 0.02;
    private static double _percentMoveSpeed = 0.01;
    private static double _percentLifeSteal = 0.02;
    private static double[] _secondaryAttribute = new double[]{_critChance, _percentPhysicalDamage,
            _percentMagicalDamage, _percentStr, _percentInt, _percentDex, _percentVit, _percentMoveSpeed,
            _percentLifeSteal};
    private static Random _randnum = new Random();

    public static int getRandomPrimaryAttribute() {
        //To Do: replace java.util.Random with an actual random function
        return _primaryAttribute[_randnum.nextInt(_primaryAttribute.length)];
    }

    public static double getRandomSecondaryAttribute() {
        //To Do: replace java.util.Random with an actual random function
        return _secondaryAttribute[_randnum.nextInt(_secondaryAttribute.length)];
    }
}
