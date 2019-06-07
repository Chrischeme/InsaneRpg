package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

import com.mygdx.insanerpg.model.item.Rarity;

public class WeaponGemFactory extends GemFactory {
    public WeaponGem createInstance() {
        WeaponGem weaponGem = new WeaponGem();
        weaponGem.setRarity(Rarity.getRandomRarity());
        switch (weaponGem.getRarity()) {
            case COMMON:
                weaponGem.setPrimaryWeaponGemAttribute(WeaponGemPrimaryAttribute.getRandomPrimaryAttribute());
                weaponGem.setPrimaryWeaponGemAttributeBonus(WeaponGemPrimaryAttribute.getRandomPrimaryAttributeBonus(
                        weaponGem.getPrimaryWeaponGemAttribute()));
                break;
            case UNCOMMON:
                weaponGem.setPrimaryWeaponGemAttribute(WeaponGemPrimaryAttribute.getRandomPrimaryAttribute());
                weaponGem.setPrimaryWeaponGemAttributeBonus(WeaponGemPrimaryAttribute.
                        getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()) +
                        WeaponGemPrimaryAttribute.getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()));
                break;
            case RARE:
                weaponGem.setPrimaryWeaponGemAttribute(WeaponGemPrimaryAttribute.getRandomPrimaryAttribute());
                weaponGem.setPrimaryWeaponGemAttributeBonus(WeaponGemPrimaryAttribute.
                        getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()) + WeaponGemPrimaryAttribute.
                        getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()));
                weaponGem.setSecondaryWeaponGemAttribute(WeaponGemSecondaryAttribute.getRandomSecondaryAttribute());
                weaponGem.setSecondaryWeaponGemAttributeBonus(WeaponGemSecondaryAttribute.
                        getRandomSecondaryAttributeBonus(weaponGem.getSecondaryWeaponGemAttribute()));
                break;
            default:
                weaponGem.setPrimaryWeaponGemAttribute(WeaponGemPrimaryAttribute.getRandomPrimaryAttribute());
                weaponGem.setPrimaryWeaponGemAttributeBonus(WeaponGemPrimaryAttribute.
                        getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()) + WeaponGemPrimaryAttribute.
                        getRandomPrimaryAttributeBonus(weaponGem.getPrimaryWeaponGemAttribute()));
                weaponGem.setSecondaryWeaponGemAttribute(WeaponGemSecondaryAttribute.getRandomSecondaryAttribute());
                weaponGem.setSecondaryWeaponGemAttributeBonus(WeaponGemSecondaryAttribute.
                        getRandomSecondaryAttributeBonus(weaponGem.getSecondaryWeaponGemAttribute()) +
                        WeaponGemSecondaryAttribute.getRandomSecondaryAttributeBonus(weaponGem.getSecondaryWeaponGemAttribute()));
        }
        return weaponGem;
    }
}
