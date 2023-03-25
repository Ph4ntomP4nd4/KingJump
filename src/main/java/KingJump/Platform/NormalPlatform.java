package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

public class NormalPlatform extends Platform{

    public NormalPlatform(Coordinate2D location) {
        super("sprites/platformSprite.png", location);
    }
}
