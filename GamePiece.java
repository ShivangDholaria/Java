
import java.awt.*;

public interface GamePiece {
    void setPosition(int x, int y);

    int getPositionX();

    int getPositionY();

    Rectangle getBoundingRegion();

    void draw(Graphics g);

    boolean isTouching(GamePiece p);
    
}