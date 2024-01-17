/**
 * Field Class
 */

import javax.swing.*;
import java.awt.*;

public class Field extends JComponent {
    public static final float GRAVITY = 9.8f;  // meter per second per second
    public static final int STEP = 20;   // duration of an animation frame in milliseconds
    public static final int APPLE_SIZE_IN_PIXELS = 30;
    public static final int TREE_WIDTH_IN_PIXELS = 50;
    public static final int TREE_HEIGHT_IN_PIXELS = 2 * TREE_WIDTH_IN_PIXELS;
    public static final int PHYSICIST_SIZE_IN_PIXELS = 70;
    public static final int MAX_TREES = 10;

    Color fieldColor = Color.LIGHT_GRAY;

    ExApple a1 = new ExApple();    
    ExApple a2 = new ExApple();    
    Tree t = new Tree();
    Physicist physicist;

    public void setupApples() {
        a1.diameter = 3.0f;
        a1.mass = 5.0f;
        a1.x = 150;
        a1.y = 50;

        a2.diameter = 5.0f;
        a2.mass = 7.0f;
        a2.x = 100;
        a2.y = 60;
    }

    public void setupTree() {
        t.setPosition(500,300);
    }

    public void setupPlayer(Physicist p) {
        physicist = p;
    }

    protected void paintComponent(Graphics g) {
        g.setColor(fieldColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        t.draw(g);
        physicist.draw(g);
        a1.draw(g);
        a2.draw(g);
    }

    public void detectCollisions() {
        if (a1.isTouching(a2)) {
            System.out.println("Collision detected");
        }
        else {
            System.out.println("No Collision detected");
        }
    }
}
