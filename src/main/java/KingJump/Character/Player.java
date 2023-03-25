package KingJump.Character;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian {
    public Player(Coordinate2D location) {
        super("sprites/playerAnimation.png", location, new Size(80, 100), 1, 5 );
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.A)){
            setMotion(3,270d);
        } else if(pressedKeys.contains(KeyCode.D)){
            setMotion(3,90d);
        } else if(pressedKeys.contains(KeyCode.SPACE)){
            setMotion(3,180d);
        } else if(pressedKeys.contains(KeyCode.S)){
                setMotion(3,360d);
        } else if(pressedKeys.isEmpty()){
            setGravityConstant(0.09);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border){
        setSpeed(0);
        switch(border){
            case TOP:
                setAnchorLocationY(50);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 150);
                break;
            case LEFT:
                setAnchorLocationX(200);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 200);
            default:
                break;
        }
    }
}
