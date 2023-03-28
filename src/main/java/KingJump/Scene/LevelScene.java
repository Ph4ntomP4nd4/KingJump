package KingJump.Scene;

import KingJump.Character.Enemy.Enemy;
import KingJump.Character.Enemy.MeleeEnemy;
import KingJump.Map.EnemyTileMap;
import KingJump.Character.Player;
import KingJump.InteractiveObject.FinishDoor;
import KingJump.InteractiveObject.Gem.BlueGem;
import KingJump.InteractiveObject.Gem.Gem;
import KingJump.InteractiveObject.Gem.GreenGem;
import KingJump.InteractiveObject.Gem.RedGem;
import KingJump.InteractiveObject.Star;
import KingJump.Map.PlatformTileMap;
import KingJump.Platform.NormalPlatform;
import KingJump.Platform.Platform;
import KingJump.Text.HealthText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.ScrollableDynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;

public class LevelScene extends ScrollableDynamicScene {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/levelbackground1.png");
        //TODO setBackgroundAudio("audio/waterworld.mp3"); (EEN LEUKE SOUNDTRACK)
        setSize(new Size(1920, 1080));
        setVerticalScrollPosition(1);
    }

    @Override
    public void setupEntities() {
        Player player = new Player(new Coordinate2D(getWidth() / 2, getHeight() / 2), new HealthText(new Coordinate2D(50, 50)));
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
        Enemy meleeEnemy = new MeleeEnemy(new Coordinate2D(getWidth() / 3, getHeight() / 2));
        addEntity(meleeEnemy);

//        HealthText healthText = new HealthText(new Coordinate2D(50, 50));
//        addEntity(healthText);
    }

//    @Override
//    public void setupTileMaps() {
//        PlatformTileMap platformTileMap = new PlatformTileMap();
//        addTileMap(platformTileMap);
////        EnemyTileMap enemyTilemap = new EnemyTileMap();
////        addTileMap(enemyTilemap);
//    }
}

