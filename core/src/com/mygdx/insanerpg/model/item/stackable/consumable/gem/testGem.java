package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

public class testGem {

    private static GemFactory _gemFactory;
    private static Gem _spawnedGem;

    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
            _gemFactory = new WeaponGemFactory();
            WeaponGem _spawnedGem = (WeaponGem)_gemFactory.createInstance();
            System.out.println(_spawnedGem.getRarity());
            System.out.println(_spawnedGem.getPrimaryWeaponGemAttribute());
            i++;
        }
    }
}
