package com.mygdx.insanerpg.model.unit;

abstract class Unit {
    private int _health;
    private String _name;
    private int _level;
    private long _id;
    private double _moveSpeed;
    private double _attackSpeed;
    private double _castSpeed;
    private boolean _isTargetable;
    private boolean _isVisible;

    public void setMoveSpeed(double _moveSpeed) {
        this._moveSpeed = _moveSpeed;
    }

    public int getHealth() {
        return _health;
    }

    public void setHealth(int _health) {
        this._health = _health;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getLevel() {
        return _level;
    }

    public void setLevel(int _level) {
        this._level = _level;
    }

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public double getMoveSpeed() {
        return _moveSpeed;
    }

    public double getAttackSpeed() {
        return _attackSpeed;
    }

    public void setAttackSpeed(double _attackSpeed) {
        this._attackSpeed = _attackSpeed;
    }

    public double getCastSpeed() {
        return _castSpeed;
    }

    public void setCastSpeed(double _castSpeed) {
        this._castSpeed = _castSpeed;
    }

    public boolean is_isTargetable() {
        return _isTargetable;
    }

    public void set_isTargetable(boolean _isTargetable) {
        this._isTargetable = _isTargetable;
    }

    public boolean is_isVisible() {
        return _isVisible;
    }

    public void set_isVisible(boolean _isVisible) {
        this._isVisible = _isVisible;
    }
}