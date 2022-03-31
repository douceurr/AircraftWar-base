package edu.hitsz.prop;

//道具抽象工厂
public interface PropFactory {
    AbstractProp createPropKind(int locationX, int locationY, int speedX, int speedY);
}