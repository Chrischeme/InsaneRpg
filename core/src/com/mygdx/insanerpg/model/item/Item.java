package com.mygdx.insanerpg.model.item;

public abstract class Item {
    private int _sellPrice;
    private int _buyPrice;
    private int _itemId;
    private String _description;
    private String _name;
    private Rarity _rarity;

    public Rarity getRarity() {
        return _rarity;
    }

    public void setRarity(Rarity rarity) {
        this._rarity = rarity;
    }
}