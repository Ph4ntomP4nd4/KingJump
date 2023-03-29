package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class GreenGem extends Gem{
    public GreenGem(Coordinate2D initialLocation, Size size) {
        super("sprites/greenGem.png", initialLocation, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
    //TODO jumpBoost
    }
}
