//package KingJump.Button;
//
//import KingJump.KingJump;
//import com.github.hanyaeger.api.AnchorPoint;
//import com.github.hanyaeger.api.Coordinate2D;
//import com.github.hanyaeger.api.entities.impl.TextEntity;
//import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
//import com.github.hanyaeger.api.userinput.MouseEnterListener;
//import com.github.hanyaeger.api.userinput.MouseExitListener;
//import javafx.scene.Cursor;
//import javafx.scene.input.MouseButton;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//
//public class Button extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
//    private KingJump kingJump;
//    public Button(Coordinate2D initialLocation, String text, AnchorPoint position, Color color, Font font, KingJump kingJump){
//        super(initialLocation, text);
//        setAnchorPoint(position);
//        setFill(color);
//        setFont(font);
//        this.kingJump = kingJump;
//    }
//    @Override
//    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
//        kingJump.setActiveScene(1);
//    }
//
//    @Override
//    public void onMouseEntered(){
//        setFill(Color.CRIMSON);
//        setCursor(Cursor.HAND);
//    }
//
//    @Override
//    public void onMouseExited(){
//        setFill(Color.DARKRED);
//        setCursor(Cursor.DEFAULT);
//    }
//}
