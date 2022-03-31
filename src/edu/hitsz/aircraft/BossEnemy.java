package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.List;

/**
 * BOSS敌机
 * 可射击
 *
 * @author hitsz
 */

public class BossEnemy extends EnemyAircraft{
    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public void createAircraft(){
        BossEnemy bossEnemy = new BossEnemy(locationX,locationY,speedX,speedY,hp);
    }
    @Override
    public List<BaseBullet> shoot() {
        return null;
    }
}
