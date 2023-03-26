package KingJump.Character;

import KingJump.Hitbox.Hitbox;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian, Collided {
    private int health;
    public Player(Coordinate2D location) {
        super("sprites/playerAnimation.png", location, new Size(80, 100), 1, 5);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.A)){
            setMotion(1.5,270d);
            setGravityConstant(0.02);
        } else if(pressedKeys.contains(KeyCode.D)){
            setMotion(1.5,90d);
            setGravityConstant(0.02);
        } else if(pressedKeys.contains(KeyCode.W)){
            setMotion(4,180d);
            setGravityConstant(0.02);
        } else if(pressedKeys.contains(KeyCode.S)){
            setMotion(3,360d);
            setGravityConstant(0.02);
        } else if(pressedKeys.isEmpty()){
            setGravityConstant(0.02);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        setSpeed(0);
        switch (border) {
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
    @Override
    public void setCurrentFrameIndex(int index) {
        super.setCurrentFrameIndex(index);
    }

    @Override
    public void onCollision(Collider collider) {
        //TODO Hitbox hitbox = new Hitbox((getWidth() / 2)(getHeight() - 200), 200, 80);
        setMotion(0, 0d);
    }
}
