package KingJump.Character.Enemy;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class Lava extends Enemy {

    public Lava(Coordinate2D location, Size size) {
        super("sprites/lava.png", location, size, 1, 1);
    }

    public void raiseLava() {
        setMotion(0.01, 180d);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                damagePlayer(player);
            }
        }
    }
}
