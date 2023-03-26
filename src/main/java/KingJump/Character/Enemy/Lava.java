package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;

public class Lava extends Enemy {

    protected Lava(String resource, Coordinate2D location) {
        super("", location);
    }

    public void raiseLava() {
        //TODO laat lava steeds stijgen
    }

    public void killPlayer() {
        //TODO kill player als hij in lava valt
    }
}
