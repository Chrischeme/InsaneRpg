package com.mygdx.insanerpg.model.item.equipment.weapon;


public class RockOnAStick extends Mace {
    public RockOnAStick(){
        super(AttackSpeed.VERY_SLOW, 10, 0, 0, 0, true);
    }

    public static void main (String[] args){
        RockOnAStick firstMaceTest = new RockOnAStick();

        System.out.println(RockOnAStick.getAttackSpeed());
    }
}
