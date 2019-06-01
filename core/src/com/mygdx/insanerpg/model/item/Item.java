package com.mygdx.insanerpg.model.item;

public abstract class Item {
    private int _sellPrice;
    private int _buyPrice;
    private int _itemId;
    private String _description;
    private String _name;
    private Rarity rarity;

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}