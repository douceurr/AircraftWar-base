package edu.hitsz.prop;

//回血道具工厂
public class BloodFactory implements PropFactory{
    @Override
    public BloodProp createPropKind(int locationX, int locationY, int speedX, int speedY){
        return new BloodProp(locationX,locationY, speedX, speedY);
    }
}
