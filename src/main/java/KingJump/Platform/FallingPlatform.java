package KingJump.Platform;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class FallingPlatform extends Platform {

    public FallingPlatform(Coordinate2D location, Size size) {
        super(location, size);
    }

    public void letPlatformFall() {
        //TODO platform laten vallen
        setMotion(0.5, 360d);
    }
}
