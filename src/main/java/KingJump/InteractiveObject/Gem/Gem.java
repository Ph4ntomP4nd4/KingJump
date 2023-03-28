package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Gem extends DynamicSpriteEntity implements Collider {
    private int color;
    public Gem(String resource, Coordinate2D initialLocation, Size size, int rows, int columns) {
        super(resource, initialLocation, new Size(50, 50), 1, 1);
    }

    public void givePowerUp () {
    }
}
