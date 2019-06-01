package com.mygdx.insanerpg.model.item.equipment.armor;

public abstract class Shoes extends Armor {
    private int _speedModifier;

    public int getSpeedModifier() {
        return _speedModifier;
    }

    public void setSpeedModifier(int _speedModifier) {
        this._speedModifier = _speedModifier;
    }
}
