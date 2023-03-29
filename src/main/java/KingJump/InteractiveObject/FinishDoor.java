package KingJump.InteractiveObject;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class FinishDoor extends DynamicSpriteEntity implements Collider {
    public FinishDoor(Coordinate2D location, Size size) {
        super("sprites/finishDoor.png", location, size);
    }

    public void progressToNextLevel () {
    }
}