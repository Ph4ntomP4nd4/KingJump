package KingJump.Character.Enemy;

import KingJump.Character.Player;
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
        if (timer <= 1) {
            setMotion(1, 90d);
        } else if (timer <= 2) {
            setMotion(1, 270d);
        }

        timer += 0.005;

        if (timer >= 2) {
            timer = 0;
        }
    }
    @Override
    public void onCollision(List<Collider> collidingObjects) {
        movePushingEnemy();
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                damagePlayer(player);
                knockbackPlayer(player);
            }
        }
    }
}
