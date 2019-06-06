package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

public class WeaponGem extends Gem {
    private WeaponGemPrimaryAttribute _primaryWeaponGemAttribute;
    private int _primaryWeaponGemAttributeBonus;
    private WeaponGemSecondaryAttribute _secondaryWeaponGemAttribute;
    private double _secondaryWeaponGemAttributeBonus;

    public WeaponGemPrimaryAttribute getPrimaryWeaponGemAttribute() {
        return _primaryWeaponGemAttribute;
    }

    public void setPrimaryWeaponGemAttribute(WeaponGemPrimaryAttribute _primaryWeaponGemAttribute) {
        this._primaryWeaponGemAttribute = _primaryWeaponGemAttribute;
    }

    public int getPrimaryWeaponGemAttributeBonus() {
        return _primaryWeaponGemAttributeBonus;
    }

    public void setPrimaryWeaponGemAttributeBonus(int _primaryWeaponGemAttributeBonus) {
        this._primaryWeaponGemAttributeBonus = _primaryWeaponGemAttributeBonus;
    }

    public double getSecondaryWeaponGemAttributeBonus() {
        return _secondaryWeaponGemAttributeBonus;
    }

    public void setSecondaryWeaponGemAttributeBonus(double _secondaryWeaponGemAttributeBonus) {
        this._secondaryWeaponGemAttributeBonus = _secondaryWeaponGemAttributeBonus;
    }

    public WeaponGemSecondaryAttribute getSecondaryWeaponGemAttribute() {
        return _secondaryWeaponGemAttribute;
    }

    public void setSecondaryWeaponGemAttribute(WeaponGemSecondaryAttribute _secondaryWeaponGemAttribute) {
        this._secondaryWeaponGemAttribute = _secondaryWeaponGemAttribute;
    }
}
