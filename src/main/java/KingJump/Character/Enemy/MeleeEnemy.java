package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;

public class MeleeEnemy extends Enemy {
    protected MeleeEnemy(String resource, Coordinate2D location) {
        super("", location);
    }

    public void hitPlayer() {
        //TODO hit player in melee range
    }
}
