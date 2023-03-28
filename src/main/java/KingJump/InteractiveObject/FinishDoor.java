package KingJump.InteractiveObject;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class FinishDoor extends DynamicSpriteEntity implements Collider {
    public FinishDoor(Coordinate2D location) {
        super("sprites/finishDoor.png", location, new Size(50, 100), 1, 1);
    }

    public void progressToNextLevel () {
    }
}