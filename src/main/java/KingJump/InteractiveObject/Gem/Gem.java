package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Gem extends DynamicSpriteEntity implements Collider, Collided {
    public Gem(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }
}
