package KingJump.Character;


import KingJump.InteractiveObject.FinishDoor;
import KingJump.KingJump;
import KingJump.Text.HealthText;
import KingJump.Text.StarText;
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

public class Player extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Newtonian, Collided, Collider {
    private final HealthText healthText;
    private final StarText starText;
    private boolean canJump = true;
    public static int health = 3;
    public int star = 0;

    private KingJump kingJump;
    private FinishDoor finishDoor;

    public Player(Coordinate2D location, HealthText healthText, StarText starText, KingJump kingJump, FinishDoor finishDoor) {
        super("sprites/playerSprites.png", location, new Size(80, 100), 1, 10);
        this.healthText = healthText;
        this.starText = starText;
        healthText.setHealthText(health);
        starText.setStarText(star);
        this.kingJump = kingJump;
        this.finishDoor = finishDoor;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.A)) {
            setMotion(2.5, 270d);
            setGravityConstant(2.5);
            setCurrentFrameIndex(4);
            setCurrentFrameIndex(3);
            canJump = false;
        } else if (pressedKeys.contains(KeyCode.D)) {
            setMotion(2.5, 90d);
            setGravityConstant(2.5);
            setCurrentFrameIndex(5);
            setCurrentFrameIndex(6);
            canJump = false;
        } else if (canJump && pressedKeys.contains(KeyCode.W)) {
            setMotion(20, 180d);
            setGravityConstant(0.5);
            setCurrentFrameIndex(7);
            setCurrentFrameIndex(8);
            canJump = false;
        } else if (pressedKeys.isEmpty()) {
            setGravityConstant(0.5);
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
    public void onCollision(List<Collider> collidingObjects) {
        //TODO Hitbox hitbox = new Hitbox((getWidth() / 2)(getHeight() - 200), 200, 80);
        setMotion(0, 0d);
        canJump = true;
        if (health == 0) {
            remove();
            kingJump.setActiveScene(3);
        } else if (finishDoor.playerCollided) {
            remove();
        }
    }
}

