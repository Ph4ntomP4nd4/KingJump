package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

import java.util.List;

public class TimerPlatform extends Platform {
    private int timer = 0;

    public TimerPlatform(Coordinate2D location, Size size) {
        super(location, size);
    }

    public void turnOnAndOff() {
        //TODO platform mbv timer laten verdwijnen
        if (timer <= 1) {
            //TODO platform aan
        } else if (timer <= 2) {
            //TODO platform uit
        }

        timer += 0.005;

        if (timer >= 2) {
            timer = 0;
        }
    }
}
