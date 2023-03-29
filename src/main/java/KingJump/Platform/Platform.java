package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Platform extends DynamicSpriteEntity implements Collider {
    public Platform(Coordinate2D location, Size size) {
        super("sprites/platformSprite.png", location, size);
    }
}
