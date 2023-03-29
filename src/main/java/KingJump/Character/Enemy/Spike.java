package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class Spike extends Enemy {

    public Spike(Coordinate2D location, Size size) {
        super("sprites/spike.png", location, size,1, 1);
    }

    public void hitPLayer() {
    }
    @Override
    public void onCollision(List<Collider> collidingObjects) {
    }
}
