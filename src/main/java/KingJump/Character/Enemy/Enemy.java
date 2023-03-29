package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Enemy extends DynamicSpriteEntity implements Collider {
    private int damage;
    public Enemy(String resource, Coordinate2D location, Size size, int row, int column) {
        super(resource, location, size, row, column);
    }
}
