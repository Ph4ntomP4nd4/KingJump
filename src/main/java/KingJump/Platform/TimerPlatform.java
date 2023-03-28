package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;

public class TimerPlatform extends Platform {
    private int timer;

    public TimerPlatform(Coordinate2D location) {
        super("sprites/platformSprite.png", location);
    }

    public void turnOnAndOff() {
        //TODO platform mbv timer laten verdwijnen
    }
}
