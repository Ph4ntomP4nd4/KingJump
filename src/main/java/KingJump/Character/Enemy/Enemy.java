package KingJump.Character.Enemy;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided {
    private int damage;
    public Enemy(String resource, Coordinate2D location, Size size, int row, int column) {
        super(resource, location, size, row, column);
    }

    @Override
    public void onCollision(List<Collider> colliders) {
        if (colliders instanceof Player) {
            health--;
            healthText.setHealthText(health);
        }
    }
}
