package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class MeleeEnemy extends Enemy {
    public MeleeEnemy(Coordinate2D location, Size size) {
        super("sprites/meleeEnemy.png", location, size, 1, 2);
    }

    public void hitPlayer() {
        //TODO hit player in melee range
    }
}
