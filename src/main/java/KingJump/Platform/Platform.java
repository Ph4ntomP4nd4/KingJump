package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class Platform extends DynamicSpriteEntity implements Collider {

    private int xPosition;
    private int yPosition;
    private int size;

    public Platform(Coordinate2D location, Size size) {
        super("sprites/platformSprite.png", location, size);
    }
}
