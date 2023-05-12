package KingJump.Character.Enemy;

import KingJump.Character.Player;
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
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                damagePlayer(player);
                knockbackPlayer(player);
            }
        }
    }
}
