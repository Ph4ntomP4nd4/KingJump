package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class BlueGem extends Gem{
    public BlueGem(Coordinate2D initialLocation) {
        super("sprites/blueGem.png", initialLocation, new Size(50, 50), 1, 1);
    }
}
