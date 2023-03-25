package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class RedGem extends Gem{
    public RedGem(Coordinate2D initialLocation) {
        super("sprites/redGem.png", initialLocation, new Size(50, 50), 1, 1);
    }
}
