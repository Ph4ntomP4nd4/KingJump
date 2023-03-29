package KingJump.Scene;

import KingJump.Map.LevelTileMap;
import KingJump.Character.Player;
import KingJump.Text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
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
        HealthText healthText = new HealthText(new Coordinate2D(250, 250));

        Player player = new Player(new Coordinate2D(getWidth() / 2, getHeight() / 2), healthText);
        addEntity(player);

        addEntity(healthText);
    }

    @Override
    public void setupTileMaps() {
        LevelTileMap levelTileMap = new LevelTileMap();
        addTileMap(levelTileMap);
    }
}

