package com.mygdx.insanerpg.model.item.equipment.armor;

import com.mygdx.insanerpg.model.item.equipment.Equipment;

public abstract class Armor extends Equipment {
    private int _physicalDefense;
    private int _magicalDefense;

    public int getPhysicalDefense() {
        return _physicalDefense;
    }

    public void setPhysicalDefense(int _physicalDefense) {
        this._physicalDefense = _physicalDefense;
    }

    public int getMagicalDefense() {
        return _magicalDefense;
    }

    public void setMagicalDefense(int _magicalDefense) {
        this._magicalDefense = _magicalDefense;
    }
}
