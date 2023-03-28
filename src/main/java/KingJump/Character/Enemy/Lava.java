package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Lava extends Enemy {

    protected Lava(String resource, Coordinate2D location) {
        super("sprites/lava.png", location, 1920, 200, 1,1);
    }

    public void raiseLava() {
        //TODO laat lava steeds stijgen
    }

    public void killPlayer() {
        //TODO kill player als hij in lava valt
    }
}
