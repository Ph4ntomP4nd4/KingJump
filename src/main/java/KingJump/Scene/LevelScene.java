package KingJump.Scene;

import KingJump.InteractiveObject.FinishDoor;
import KingJump.InteractiveObject.Gem.BlueGem;
import KingJump.InteractiveObject.Gem.Gem;
import KingJump.InteractiveObject.Gem.GreenGem;
import KingJump.InteractiveObject.Gem.RedGem;
import KingJump.InteractiveObject.Star;
import KingJump.Map.LevelTileMap;
import KingJump.Character.Player;
import KingJump.Text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;

public class LevelScene extends DynamicScene implements TileMapContainer {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelbackground1.png");
        //TODO setBackgroundAudio("audio/waterworld.mp3"); (EEN LEUKE SOUNDTRACK)
    }

    @Override
    public void setupEntities() {
        HealthText healthText = new HealthText(new Coordinate2D(250, 75));
        addEntity(healthText);

        Player player = new Player(new Coordinate2D(getWidth() / 2, getHeight() / 2), healthText);
        addEntity(player);

        Star star1 = new Star(new Coordinate2D(340, 300), new Size(50,50));
        addEntity(star1);
        Star star2 = new Star(new Coordinate2D(1550, getHeight() - 240), new Size(50,50));
        addEntity(star2);
        Star star3 = new Star(new Coordinate2D(1550, 160), new Size(50,50));
        addEntity(star3);

        Gem redGem = new RedGem(new Coordinate2D(1350, 575), new Size(50, 50));
        Gem greenGem = new GreenGem(new Coordinate2D(1050, 300), new Size(50, 50));
        Gem blueGem = new BlueGem(new Coordinate2D(430, 710), new Size(50, 50));
        addEntity(redGem);
        addEntity(greenGem);
        addEntity(blueGem);

        FinishDoor finishDoor = new FinishDoor(new Coordinate2D(1150, 140), new Size(50,80));
        addEntity(finishDoor);

    }

    @Override
    public void setupTileMaps() {
        LevelTileMap levelTileMap = new LevelTileMap();
        addTileMap(levelTileMap);
    }
}

