package KingJump.InteractiveObject;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public class FinishDoor extends DynamicSpriteEntity implements Collider, Collided {
    public FinishDoor(Coordinate2D location, Size size) {
        super("sprites/finishDoor.png", location, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
      //TODO progress to next level
    }
}