package com.mygdx.insanerpg.model.item.equipment.weapon;

import com.mygdx.insanerpg.model.item.equipment.Equipment;
import com.mygdx.insanerpg.model.item.stackable.consumable.gem.WeaponGem;
import java.util.ArrayList;

public abstract class Weapon extends Equipment {
    private int _physicalDamage;
    private int _magicalDamage;
    private boolean _isOneHanded;
    private int _armorPenetration;
    private int _magicPenetration;
    private AttackSpeed _attackSpeed;
    private ArrayList<WeaponGem> _WeaponGemList;

    public int getPhysicalDamage() {
        return _physicalDamage;
    }

    public void setPhysicalDamage(int _PhysicalDamage) {
        this._physicalDamage = _PhysicalDamage;
    }

    public int getMagicalDamage() {
        return _magicalDamage;
    }

    public void setMagicalDamage(int _MagicalDamage) {
        this._magicalDamage = _MagicalDamage;
    }

    public int getArmorPenetration() {
        return _armorPenetration;
    }

    public void setArmorPenetration(int _armorPenetration) {
        this._armorPenetration = _armorPenetration;
    }

    public int getMagicPenetration() {
        return _magicPenetration;
    }

    public void setMagicPenetration(int _magicPenetration) {
        this._magicPenetration = _magicPenetration;
    }

    public AttackSpeed getAttackSpeed() {
        return _attackSpeed;
    }

    public void setAttackSpeed(AttackSpeed attackSpeed) {
        this._attackSpeed = attackSpeed;
    }

    public boolean getIsOneHanded() {
        return _isOneHanded;
    }

    public Weapon(AttackSpeed attackSpeed, int physicalDamage, int magicalDamage, int armorPenetration, int magicPenetration, boolean isOneHanded) {
        _attackSpeed = attackSpeed;
        _physicalDamage = physicalDamage;
        _magicalDamage = magicalDamage;
        _armorPenetration = armorPenetration;
        _magicPenetration = magicPenetration;
        _isOneHanded = isOneHanded;
        _WeaponGemList = new ArrayList<WeaponGem>();
    }

    public Weapon() {
    }
}