package KingJump.Scene;

import KingJump.Character.Player;
import KingJump.Platform.NormalPlatform;
import KingJump.Platform.Platform;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class LevelScene extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelbackground1.png");
        //TODO setBackgroundAudio("audio/waterworld.mp3"); (EEN LEUKE SOUNDTRACK)
    }

    @Override
    public void setupEntities() {
        Player player = new Player(new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(player);
        Platform platform = new NormalPlatform(new Coordinate2D(getWidth() / 2, getHeight() - 200));
        addEntity(platform);
    }
}

