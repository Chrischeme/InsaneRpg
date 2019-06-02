package com.mygdx.insanerpg.model.unit;

abstract class Player extends Unit {
    private int _intelligence;
    private int _dexterity;
    private int _vitality;
    private int _strength;

    public int getIntelligence() {
        return _intelligence;
    }

    public void setIntelligence(int _intelligence) {
        this._intelligence = _intelligence;
    }

    public int getDexterity() {
        return _dexterity;
    }

    public void setDexterity(int _dexterity) {
        this._dexterity = _dexterity;
    }

    public int getVitality() {
        return _vitality;
    }

    public void setVitality(int _vitality) {
        this._vitality = _vitality;
    }

    public int getStrength() {
        return _strength;
    }

    public void setStrength(int _strength) {
        this._strength = _strength;
    }


    public Player(int hitPoints, int manaPoints, String name, int level, int id, int moveSpeed, double  attackSpeed, double  castSpeed, boolean isTargetable, double orientationAngle,
                  double xCoordinate, double yCoordinate, int intelligence, int dexterity, int vitality, int strength) {
        super(hitPoints, manaPoints, name, level, id, moveSpeed, attackSpeed, castSpeed, isTargetable, orientationAngle, xCoordinate, yCoordinate);
        setIntelligence(intelligence);
        setDexterity(dexterity);
        setVitality(vitality);
        setStrength(strength);
    }

    public Player(){
    }

}