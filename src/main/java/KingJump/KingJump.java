package KingJump;

import KingJump.InteractiveObject.FinishDoor;
import KingJump.Scene.GameOverScene;
import KingJump.Scene.LevelScene;
import KingJump.Scene.GameFinishedScene;
import KingJump.Scene.TitleScene;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class KingJump extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void setupGame() {
        setGameTitle("KingJump");
        setSize(new Size(1920, 1080));
    }
    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new LevelScene(this, this));
        addScene(2, new GameFinishedScene());
        addScene(3, new GameOverScene());

    }
}
