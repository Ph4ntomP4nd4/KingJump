package KingJump.Character.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Lava extends Enemy {

    public Lava(Coordinate2D location, Size size) {
        super("sprites/lava.png", location, size, 1, 1);
    }

    public void raiseLava() {
        //TODO laat lava steeds stijgen
    }

    public void killPlayer() {
        //TODO kill player als hij in lava valt
    }
}
