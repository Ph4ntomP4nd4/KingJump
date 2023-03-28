package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class PushingEnemy extends Enemy {

    public PushingEnemy(String resource, Coordinate2D location) {
        super("sprites/pushingEnemy.png", location, 200,300, 1, 1);
    }

    public void pushPlayer() {
        //TODO push player continu
    }
}
