package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;

public class ShootingEnemy extends Enemy {

    protected ShootingEnemy(String resource, Coordinate2D location) {
        super("sprites/shootingEnemy.png", location);
    }

    public void shootPlayer() {
        //TODO shoot player
    }
}
