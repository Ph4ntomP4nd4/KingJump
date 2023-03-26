package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;

public class PushingEnemy extends Enemy {

    protected PushingEnemy(String resource, Coordinate2D location) {
        super("sprites/pushingEnemy.png", location);
    }

    public void pushPlayer() {
        //TODO push player continu
    }
}
