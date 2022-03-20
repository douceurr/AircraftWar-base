package edu.hitsz.aircraft;

import edu.hitsz.basic.FlyingObject;
import edu.hitsz.bullet.AbstractBullet;

import java.util.List;

/**
 * 敌机的抽象父类
 * 敌机（BOSS, ELITE, MOB）
 *
 * @author hitsz
 */
public abstract class EnemyAircraft extends AbstractAircraft{
    protected int maxHp;
    protected int hp;
    public EnemyAircraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY);
        this.hp = hp;
        this.maxHp = hp;
    }
    //碰撞后
    public void decreaseHp(int decrease){
        hp -= decrease;
        if(hp <= 0){
            hp=0;
            vanish();
        }
    }

    public int getHp() {
        return hp;
    }

    public abstract List<AbstractBullet> shoot();
}

