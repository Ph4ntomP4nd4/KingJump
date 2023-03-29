package KingJump.Scene;

import KingJump.Map.EnemyTileMap;
import KingJump.Character.Player;
import KingJump.InteractiveObject.FinishDoor;
import KingJump.InteractiveObject.Gem.BlueGem;
import KingJump.InteractiveObject.Gem.Gem;
import KingJump.InteractiveObject.Gem.GreenGem;
import KingJump.InteractiveObject.Gem.RedGem;
import KingJump.InteractiveObject.Star;
import KingJump.Map.PlatformTileMap;
import KingJump.Text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;

public class LevelScene extends DynamicScene implements TileMapContainer {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelbackground1.png");
        //TODO setBackgroundAudio("audio/waterworld.mp3"); (EEN LEUKE SOUNDTRACK)
    }

    @Override
    public void setupEntities() {
        Player player = new Player(new Coordinate2D(getWidth() / 2, getHeight() / 2), new HealthText(new Coordinate2D(50, 50)));
        addEntity(player);
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

//        HealthText healthText = new HealthText(new Coordinate2D(50, 50));
//        addEntity(healthText);
    }

    @Override
    public void setupTileMaps() {
        PlatformTileMap platformTileMap = new PlatformTileMap();
        addTileMap(platformTileMap);
        EnemyTileMap enemyTilemap = new EnemyTileMap();
        addTileMap(enemyTilemap);
    }
}

