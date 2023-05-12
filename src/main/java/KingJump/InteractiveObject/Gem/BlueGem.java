package KingJump.InteractiveObject.Gem;

import KingJump.Character.Player;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class BlueGem extends Gem{
    public BlueGem(Coordinate2D initialLocation, Size size) {
        super("sprites/blueGem.png", initialLocation, size);
    }

    void activatePower(Player player) {
        System.out.println("shield activated");
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Player) {
                Player player = (Player) collider;
                activatePower(player);
                remove();
            }
        }
    }
}
