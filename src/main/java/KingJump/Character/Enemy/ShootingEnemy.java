package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class ShootingEnemy extends Enemy implements Collider {

    public ShootingEnemy(Coordinate2D location, Size size) {
        super("sprites/shootingEnemy.png", location, size, 1, 1);
    }

    public void shootPlayer() {
        //TODO shoot player
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
    }
}
