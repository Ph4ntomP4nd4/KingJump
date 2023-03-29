package KingJump.Character;

import KingJump.Character.Enemy.MeleeEnemy;
import KingJump.Hitbox.Hitbox;
import KingJump.Text.HealthText;
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

import java.util.List;
import java.util.Set;

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian, Collided {
    private HealthText healthText;
    private int health = 3;
    public Player(Coordinate2D location, HealthText healthText) {
        super("sprites/playerSprites.png", location, new Size(80, 100), 1, 10);
        this.healthText = healthText;
        healthText.setHealthText(health);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if(pressedKeys.contains(KeyCode.A)){
            setMotion(2,270d);
            setGravityConstant(0.5);
            setCurrentFrameIndex(4);
            setCurrentFrameIndex(3);
        } else if(pressedKeys.contains(KeyCode.D)){
            setMotion(2,90d);
            setGravityConstant(0.5);
            setCurrentFrameIndex(5);
            setCurrentFrameIndex(6);
        } else if(pressedKeys.contains(KeyCode.W)){
            setMotion(5,180d);
            setGravityConstant(0.05);
            setCurrentFrameIndex(7);
            setCurrentFrameIndex(8);
        } else if(pressedKeys.isEmpty()){
            setGravityConstant(0.05);
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
    public void onCollision(List<Collider> colliders) {
        //TODO Hitbox hitbox = new Hitbox((getWidth() / 2)(getHeight() - 200), 200, 80);
        setMotion(0, 0d);
//            health--;
//            healthText.setHealthText(health);
//            System.out.println(health);
    }
}

