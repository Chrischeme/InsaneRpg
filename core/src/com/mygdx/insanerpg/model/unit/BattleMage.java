package com.mygdx.insanerpg.model.unit;

class BattleMage extends Player implements Movable {
    public void Move(double cursorXCoordinate, double cursorYCoordinate ){
        if (cursorXCoordinate != getXCoordinate()){
            setXCoordinate(getXCoordinate()+getMoveSpeed()*Math.cos(getOrientationAngle()));
        }
        if (cursorYCoordinate != getYCoordinate()){
            setYCoordinate(getYCoordinate()+getMoveSpeed()*Math.sin(getOrientationAngle()));
        }
    }

    public BattleMage(){
        super(100,200,"Ye Qiu",1,1,10,1.5,1.5,true,
                0,0,0,10,3,3,3);
    }
}