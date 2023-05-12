package KingJump.Character.Enemy;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class Spike extends Enemy {

    public Spike(Coordinate2D location, Size size) {
        super("sprites/spike.png", location, size,1, 1);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                damagePlayer(player);
                knockbackPlayer(player);
            }
        }
    }
}
