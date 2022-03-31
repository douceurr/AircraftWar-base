package edu.hitsz.prop;

//火力道具工厂
public class BulletFactory implements PropFactory{
    @Override
    public BulletProp createPropKind(int locationX,int locationY,int speedX,int speedY){
        return new BulletProp(locationX,locationY, speedX, speedY);
    }

}
