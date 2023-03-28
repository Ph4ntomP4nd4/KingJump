package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Spike extends Enemy {

    protected Spike(String resource, Coordinate2D location) {
        super("sprites/spike.png", location, 200,100, 1, 1);
    }
}
