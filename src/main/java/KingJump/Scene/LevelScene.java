package KingJump.Scene;

import KingJump.Camera.Camera;
import KingJump.Character.Player;
import KingJump.InteractiveObject.FinishDoor;
import KingJump.InteractiveObject.Gem.BlueGem;
import KingJump.InteractiveObject.Gem.Gem;
import KingJump.InteractiveObject.Gem.GreenGem;
import KingJump.InteractiveObject.Gem.RedGem;
import KingJump.InteractiveObject.Star;
import KingJump.Platform.NormalPlatform;
import KingJump.Platform.Platform;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class LevelScene extends DynamicScene implements Camera {
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
        Star star = new Star(new Coordinate2D(getWidth() / 2, getHeight() - 250));
        addEntity(star);
        FinishDoor finishDoor = new FinishDoor(new Coordinate2D(getWidth() / 2 + 50, getHeight() - 275));
        addEntity(finishDoor);
        Gem redGem = new RedGem(new Coordinate2D(getWidth() / 2, getHeight() / 2));
        Gem blueGem = new BlueGem(new Coordinate2D(getWidth() / 2 + 100, getHeight() / 2));
        Gem greenGem = new GreenGem(new Coordinate2D(getWidth() / 2 + 200, getHeight() / 2));
        addEntity(redGem);
        addEntity(blueGem);
        addEntity(greenGem);
    }
}

