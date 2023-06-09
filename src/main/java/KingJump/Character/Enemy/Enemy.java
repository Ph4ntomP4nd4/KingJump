package KingJump.Character.Enemy;

import KingJump.Character.Player;
import KingJump.Text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.List;

public abstract class Enemy extends DynamicSpriteEntity implements Collider, Collided {
    public Enemy(String resource, Coordinate2D location, Size size, int row, int column) {
        super(resource, location, size, row, column);
    }

    void damagePlayer(Player player) {
        player.health--;
        System.out.println(player.health);
    }

    void knockbackPlayer(Player player) {
        player.setAnchorLocation(new Coordinate2D(getWidth()/2, getHeight() - 300));
    }

}
