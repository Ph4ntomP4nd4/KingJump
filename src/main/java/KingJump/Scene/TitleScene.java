package KingJump.Scene;

import KingJump.Button.StartButton;
import KingJump.KingJump;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {
    private KingJump kingJump;

    public TitleScene (KingJump kingJump) {
        this.kingJump = kingJump;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titleScene.jpg");
        //TODO setBackgroundAudio("");
    }

    @Override
    public void setupEntities() {
        var kingjumpText = new TextEntity(new Coordinate2D(getWidth() / 1.5, getHeight() / 3), "KingJump");
        kingjumpText.setAnchorPoint(AnchorPoint.BOTTOM_LEFT);
        kingjumpText.setFill(Color.DARKRED);
        kingjumpText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
        addEntity(kingjumpText);

        var startButton = new StartButton(new Coordinate2D(getWidth() / 1.4, getHeight() / 2.5), kingJump);
        addEntity(startButton);
    }
}
