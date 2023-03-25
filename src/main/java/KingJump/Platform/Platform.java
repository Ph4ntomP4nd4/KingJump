package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Platform extends DynamicSpriteEntity implements Collider {
    private int xPosition;
    private int yPosition;
    private int size;

    public Platform(String resource, Coordinate2D location) {
        super("sprites/platformSprite.png", location, new Size(200, 80), 1, 1);
    }
}
