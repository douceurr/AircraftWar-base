package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.List;

/**
 * 敌机的抽象父类
 * 敌机（BOSS, ELITE, MOB）
 *
 * @author hitsz
 */
public abstract class EnemyAircraft extends AbstractAircraft{
    public EnemyAircraft(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }
}

