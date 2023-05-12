package KingJump.InteractiveObject.Gem;

import KingJump.Character.Player;
import KingJump.Scene.LevelScene;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class RedGem extends Gem{
    private Player player;
    public RedGem(Coordinate2D initialLocation, Size size) {
        super("sprites/redGem.png", initialLocation, size);
    }

    @Override
    void activatePower(Player player) {
        Player.health++;
        System.out.println(player.health);
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
