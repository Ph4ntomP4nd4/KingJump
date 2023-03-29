package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class FallingPlatform extends Platform implements Collided {

    public FallingPlatform(Coordinate2D location, Size size) {
        super(location, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        //TODO platform laten vallen
        setMotion(0.5, 360d);
    }
}
