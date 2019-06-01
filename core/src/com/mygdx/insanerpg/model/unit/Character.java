package com.mygdx.insanerpg.model.unit;

abstract class Character extends Unit {
    private int _intelligence;
    private int _dexterity;
    private int _vitality;
    private int _strength;

    public int get_intelligence() {
        return _intelligence;
    }

    public void set_intelligence(int _intelligence) {
        this._intelligence = _intelligence;
    }

    public int get_dexterity() {
        return _dexterity;
    }

    public void set_dexterity(int _dexterity) {
        this._dexterity = _dexterity;
    }

    public int get_vitality() {
        return _vitality;
    }

    public void set_vitality(int _vitality) {
        this._vitality = _vitality;
    }

    public int get_strength() {
        return _strength;
    }

    public void set_strength(int _strength) {
        this._strength = _strength;
    }
}