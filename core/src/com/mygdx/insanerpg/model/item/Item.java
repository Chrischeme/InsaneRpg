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

    public int getSellPrice() {
        return _sellPrice;
    }

    public void setSellPrice(int _sellPrice) {
        this._sellPrice = _sellPrice;
    }

    public int getBuyPrice() {
        return _buyPrice;
    }

    public void setBuyPrice(int _buyPrice) {
        this._buyPrice = _buyPrice;
    }

    public int getItemId() {
        return _itemId;
    }

    public String getDescription() {
        return _description;
    }

    public String getName() {
        return _name;
    }
}