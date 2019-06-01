package com.mygdx.insanerpg.model.unit;

abstract class Mob extends Unit {
    private boolean _isFriendly;

    public boolean is_isFriendly() {
        return _isFriendly;
    }

    public void set_isFriendly(boolean _isFriendly) {
        this._isFriendly = _isFriendly;
    }
}