package KingJump.Text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StarText extends TextEntity {
    public StarText(Coordinate2D initialLocation){
        super(initialLocation);

        setFont(Font.font("Roboto", FontWeight.NORMAL, 30));
        setFill(Color.YELLOW);
    }

    public void setStarText(int health){
        setText("Health: " + health);
    }

}
