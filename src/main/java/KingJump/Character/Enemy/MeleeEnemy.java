package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class MeleeEnemy extends Enemy {
    public MeleeEnemy(Coordinate2D location, Size size) {
        super("sprites/meleeEnemy.png", location, size, 1, 2);
    }
    @Override
    public void onCollision(List<Collider> collidingObjects) {
        //TODO hit player in melee range
    }
}
