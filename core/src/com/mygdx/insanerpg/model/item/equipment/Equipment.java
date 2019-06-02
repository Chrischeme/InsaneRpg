package com.mygdx.insanerpg.model.item.equipment;

import com.mygdx.insanerpg.model.item.Item;
import com.mygdx.insanerpg.model.item.stackable.consumable.Gem;
import java.util.ArrayList;

public abstract class Equipment extends Item {
    private int _maxDurability;
    private int _currentDurability;
    private int _numTotalSockets;
    private ArrayList<Gem> _gemList;

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
}
