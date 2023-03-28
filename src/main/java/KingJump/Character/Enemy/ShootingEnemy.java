package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class ShootingEnemy extends Enemy implements Collider {

    public ShootingEnemy(String resource, Coordinate2D location) {
        super("sprites/shootingEnemy.png", location, 100,200, 1, 1);
    }

    public void shootPlayer() {
        //TODO shoot player
    }
}
