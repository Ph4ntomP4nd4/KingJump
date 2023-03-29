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
        timer += 0.01;
        if (timer >= 1) {
            //laat platform verdwijnen
            timer = 0;
        }
    }
}
