package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import com.mygdx.insanerpg.model.item.Rarity;

public class testGem {

    private static GemFactory _gemFactory;
    private static Gem _spawnedGem;

    public static void main(String[] args) {
        int i = 0;
        while (i < 1000) {
            _gemFactory = new WeaponGemFactory();
            WeaponGem _spawnedGem = (WeaponGem) _gemFactory.createInstance();
            if (_spawnedGem.getRarity() == Rarity.RARE) {
                System.out.println(_spawnedGem.getRarity());
                System.out.println(_spawnedGem.getPrimaryWeaponGemAttribute());
                System.out.println("primaryWeaponAttributeBonus is " + _spawnedGem.getPrimaryWeaponGemAttributeBonus());
                System.out.println(_spawnedGem.getSecondaryWeaponGemAttribute());
                System.out.println("secondaryWeaponAttributeBonus is " + _spawnedGem.getSecondaryWeaponGemAttributeBonus());
                System.out.println();
            }
            i++;
        }
    }
}
