package edu.hitsz.prop;

import edu.hitsz.application.Main;
import edu.hitsz.basic.FlyingObject;
import java.util.Random;

/**
 * 道具类。
 *
 * @author hitsz
 */

public class AbstractProp extends FlyingObject{

    private int Random(){
        Random ran = new Random();
        int usage = ran.nextInt(3);
        return usage;
    }
    public AbstractProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
        int type = Random();
        switch(type){
            case 0:
                BloodProp bloodProp = new BloodProp(getLocationX(),getLocationY(),speedX,speedY);
                return;
            case 1:
                BombProp bombProp = new BombProp(getLocationX(),getLocationY(),speedX,speedY);
                return;
            case 2:
                BulletProp bulletProp = new BulletProp(getLocationX(),getLocationY(),speedX,speedY);
                return;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }



    @Override
    public void forward() {
        super.forward();

        // 判定 x 轴出界
        if (locationX <= 0 || locationX >= Main.WINDOW_WIDTH) {
            vanish();
        }

        // 判定 y 轴出界
        if (speedY > 0 && locationY >= Main.WINDOW_HEIGHT ) {
            // 向下飞行出界
            vanish();
        }else if (locationY <= 0){
            // 向上飞行出界
            vanish();
        }
    }

}
