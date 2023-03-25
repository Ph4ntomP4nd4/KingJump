package KingJump.InteractiveObject.Gem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class GreenGem extends Gem{
    public GreenGem(Coordinate2D initialLocation) {
        super("sprites/greenGem.png", initialLocation, new Size(50, 50), 1, 1);
    }
}
