package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import com.mygdx.insanerpg.model.item.Rarity;

public class WeaponGemFactory extends GemFactory {
    public WeaponGem createInstance(){
        WeaponGem weaponGem = new WeaponGem();
        weaponGem.setRarity(Rarity.getRandomRarity());
        weaponGem.setPrimaryWeaponGemAttribute(WeaponGemAttribute.getRandomPrimaryAttribute());
        return weaponGem;
    }
}
