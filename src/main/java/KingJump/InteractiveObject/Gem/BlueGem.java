package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class BlueGem extends Gem{
    public BlueGem(Coordinate2D initialLocation, Size size) {
        super("sprites/blueGem.png", initialLocation, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
    //TODO shield
    }
}
