package KingJump.InteractiveObject;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public class Star extends DynamicSpriteEntity implements Collider, Collided {
    public Star(Coordinate2D location, Size size) {
        super("sprites/star.png", location, size);
    }

    public void givePlayerStar (Player player) {
        player.star++;
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                givePlayerStar(player);
                remove();
            }
        }
    }
}
