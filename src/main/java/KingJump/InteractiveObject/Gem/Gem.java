package KingJump.InteractiveObject.Gem;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Gem extends DynamicSpriteEntity implements Collider, Collided {
    public Gem(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }

    void activatePower(Player player) {
        //this method activates the gem once it collided with a Player object
    }

    void removeGem(Player player) {
        //this method removes the gem once it collided with a Player object
    }

    public void removeGem(Object object) {
        object = null;
    }
}
