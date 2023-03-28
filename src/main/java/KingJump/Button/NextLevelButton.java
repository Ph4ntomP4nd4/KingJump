package KingJump.Button;

import KingJump.KingJump;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class NextLevelButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private KingJump kingJump;
    public NextLevelButton(Coordinate2D initialLocation, KingJump kingJump){
        super(initialLocation,"Next Level");
        setAnchorPoint(AnchorPoint.CENTER_LEFT);
        setFill(Color.DARKRED);
        setFont(Font.font("Roboto", FontWeight.NORMAL, 40));
        this.kingJump = kingJump;
    }
    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        kingJump.setActiveScene(2);
    }

    @Override
    public void onMouseEntered(){
        setFill(Color.CRIMSON);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.DARKRED);
        setCursor(Cursor.DEFAULT);
    }

}

