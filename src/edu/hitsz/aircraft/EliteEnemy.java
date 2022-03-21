package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;


/**
 * 精英敌机
 * 可射击
 *
 * @author hitsz
 */
public class EliteEnemy extends EnemyAircraft{
    /** 攻击方式 */
    private int shootNum = 1;     //子弹一次发射数量
    private int power = 10;       //子弹伤害
    private int direction = 1;  //子弹射击方向 (向上发射：-1，向下发射：1)

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public void forward() {
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }

    @Override
    /**
     * 精英机通过射击产生子弹
     * @return 射击出的子弹List
     */
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX() + direction*5;
        int y = this.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = this.getSpeedY() + direction*5;

        //设置x轴偏移变量，使画面左边的精英机朝右侧斜射子弹，画面右边的精英机朝左边斜射子弹
        int x_plus = (x <= (Main.WINDOW_WIDTH / 2)) ? 5 : -5;
        BaseBullet baseBullet;
        baseBullet = new EnemyBullet(x , y, speedX +x_plus, speedY, power);
        res.add(baseBullet);

        return res;
    }

}
