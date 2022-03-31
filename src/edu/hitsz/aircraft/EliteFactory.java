package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;

import java.util.List;

//精英机工厂
public class EliteFactory implements AircraftFactory {
    @Override
    public EnemyAircraft createAircraftKind(){
        return new EliteEnemy((int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth())) * 1, (int) (Math.random() * Main.WINDOW_HEIGHT * 0.1) * 1, 0, 5, 30);
    }
}
