package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class PushingEnemy extends Enemy {
    private double timer = 0;

    public PushingEnemy(Coordinate2D location, Size size) {
        super("sprites/pushingEnemy.png", location, size, 1, 1);
    }

    public void movePushingEnemy() {
        //TODO push player continu
        setMotion(1, 90d);
        timer += 0.01;
        if (timer >= 1) {
            setMotion(1, 270d);
            timer = 0;
        }

    }
    @Override
    public void onCollision(List<Collider> collidingObjects) {
    }
}
