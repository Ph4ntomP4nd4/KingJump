package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class PushingEnemy extends Enemy {

    public PushingEnemy(Coordinate2D location, Size size) {
        super("sprites/pushingEnemy.png", location, size, 1, 1);
    }

    public void pushPlayer() {
        //TODO push player continu
    }
    @Override
    public void onCollision(List<Collider> collidingObjects) {
    }
}
