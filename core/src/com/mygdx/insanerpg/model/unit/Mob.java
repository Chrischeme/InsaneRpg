package com.mygdx.insanerpg.model.unit;

abstract class Mob extends Unit {
    private boolean _isFriendly;

    public boolean getIsFriendly() {
        return _isFriendly;
    }

    public void setIsFriendly(boolean _isFriendly) {
        this._isFriendly = _isFriendly;
    }
}