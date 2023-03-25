package KingJump.Hitbox;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;

public class Hitbox extends RectangleEntity implements Collider {
    private int width;
    private int height;

    public Hitbox(Coordinate2D initialLocation, int width, int height) {
        super(initialLocation);
        this.width = width;
        this.height = height;
    }
}
