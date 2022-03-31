package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;

import java.util.List;

//BOSS机工厂
public class BossFactory implements AircraftFactory {

    @Override
    public EnemyAircraft createAircraftKind(){
        return new EliteEnemy((int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.MOB_ENEMY_IMAGE.getWidth())) * 1, (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2) * 1, 0, 10, 30);
    }
}
