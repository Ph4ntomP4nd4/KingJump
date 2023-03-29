package KingJump.InteractiveObject;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Star extends DynamicSpriteEntity implements Collider {
    public Star(Coordinate2D location, Size size) {
        super("sprites/star.png", location, size);
    }

    public void givePlayerStar () {
    }
}
