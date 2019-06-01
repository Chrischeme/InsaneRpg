package com.mygdx.insanerpg.model.item.equipment;

import com.mygdx.insanerpg.model.item.Item;

public abstract class Equipment extends Item {
    private int _maxDurability;
    private int _currentDurability;
    private int _numTotalSockets;
    private int _numFreeSockets;

    public int getNumTotalSockets() {
        return _numTotalSockets;
    }

    public void setNumTotalSockets(int numTotalSockets) {
        this._numTotalSockets = numTotalSockets;
    }

    public int getMaxDurability() {
        return _maxDurability;
    }

    public void setMaxDurability(int _maxDurability) {
        this._maxDurability = _maxDurability;
    }

    public int getCurrentDurability() {
        return _currentDurability;
    }

    public void setCurrentDurability(int _currentDurability) {
        this._currentDurability = _currentDurability;
    }

    public int getNumFreeSockets() {
        return _numFreeSockets;
    }

    public void setNumFreeSockets(int numFreeSockets) {
        this._numFreeSockets = numFreeSockets;
    }
}
