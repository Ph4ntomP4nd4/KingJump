package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Enemy extends DynamicSpriteEntity {
    private int health;
    protected Enemy(String resource, Coordinate2D location) {
        super(resource, location);
    }
}
