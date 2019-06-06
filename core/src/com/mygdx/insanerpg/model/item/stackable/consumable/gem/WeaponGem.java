package com.mygdx.insanerpg.model.item.stackable.consumable.gem;

public class WeaponGem extends Gem {
    private int _primaryWeaponGemAttribute;
    private double _secondaryWeaponGemAttribute;

    public int getPrimaryWeaponGemAttribute() {
        return _primaryWeaponGemAttribute;
    }

    public void setPrimaryWeaponGemAttribute(int _primaryWeaponGemAttribute) {
        this._primaryWeaponGemAttribute = _primaryWeaponGemAttribute;
    }

    public double getSecondaryWeaponGemAttribute() {
        return _secondaryWeaponGemAttribute;
    }

    public void setSecondaryWeaponGemAttribute(double _secondaryWeaponGemAttribute) {
        this._secondaryWeaponGemAttribute = _secondaryWeaponGemAttribute;
    }
}
