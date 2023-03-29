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
        //TODO laat lava steeds stijgen
        setMotion(0.1, 180d);
    }

    public void killPlayer() {
        //TODO kill player als hij in lava valt
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {

    }
}
