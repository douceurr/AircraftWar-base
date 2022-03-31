package edu.hitsz.prop;

//炸弹道具工厂
public class BombFactory implements PropFactory{
    @Override
    public BombProp createPropKind(int locationX,int locationY,int speedX,int speedY){
        return new BombProp(locationX,locationY, speedX, speedY);
    }
}
