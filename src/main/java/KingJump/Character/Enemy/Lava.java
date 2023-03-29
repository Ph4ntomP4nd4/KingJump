package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class Lava extends Enemy {

    public Lava(Coordinate2D location, Size size) {
        super("sprites/lava.png", location, size, 1, 1);
    }

    public void raiseLava() {
        setMotion(0.3, 180d);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        //TODO kill player als hij in lava valt
    }
}
