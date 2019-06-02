package com.mygdx.insanerpg.model.unit;

abstract class Unit {
    private int _hitPoints;
    private int _manaPoints;
    private String _name;
    private int _level;
    private long _id;
    private double _moveSpeed;
    private double _attackSpeed;
    private double _castSpeed;
    private boolean _isTargetable;
    private double _xCoordinate;
    private double _yCoordinate;
    private double _orientationAngle;

    public int getHitPoints() {
        return _hitPoints;
    }

    public void setHitPoints(int _health) {
        this._hitPoints = _health;
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

    public void setMoveSpeed(double _moveSpeed) {
        this._moveSpeed = _moveSpeed;
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

    public boolean getIsTargetable() {
        return _isTargetable;
    }

    public void setIsTargetable(boolean _isTargetable) {
        this._isTargetable = _isTargetable;
    }

    public int getManaPoints() {
        return _manaPoints;
    }

    public void setManaPoints(int _manaPoints) {
        this._manaPoints = _manaPoints;
    }

    public double getXCoordinate() {
        return _xCoordinate;
    }

    public void setXCoordinate(double _xCoordinate) {
        this._xCoordinate = _xCoordinate;
    }

    public double getYCoordinate() {
        return _yCoordinate;
    }

    public void setYCoordinate(double _yCoordinate) {
        this._yCoordinate = _yCoordinate;
    }

    public double getOrientationAngle() {
        return _orientationAngle;
    }

    public void setOrientationAngle(double _orientationAngle) {
        this._orientationAngle = _orientationAngle;
    }

    public Unit(int hitPoints, int manaPoints, String name, int level, int id, int moveSpeed, double attackSpeed, double  castSpeed, boolean isTargetable, double orientationAngle,
                double xCoordinate, double yCoordinate) {
        setHitPoints(hitPoints);
        setManaPoints(manaPoints);
        setName(name);
        setLevel(level);
        setManaPoints(moveSpeed);
        setAttackSpeed(attackSpeed);
        setCastSpeed(castSpeed);
        setIsTargetable(isTargetable);
        setOrientationAngle(orientationAngle);
        setXCoordinate(xCoordinate);
        setYCoordinate(yCoordinate);
    }

    public Unit() {
    }
}