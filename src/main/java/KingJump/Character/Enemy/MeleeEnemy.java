package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class MeleeEnemy extends Enemy {
    public MeleeEnemy(Coordinate2D location) {
        super("sprites/meleeEnemy.png", location, 100, 100, 1, 2);
    }

    public void hitPlayer() {
        //TODO hit player in melee range
    }
}
