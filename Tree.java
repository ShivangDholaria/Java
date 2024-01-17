

import java.awt.*;

public class Tree implements GamePiece{
    // Coordinates
    int x, y;

    // Tree graphic initializers
    private Color leafColor = Color.GREEN.darker();
    private Color trunkColor = new Color(100, 67, 33);
    private int trunkWidth = (int)(Field.TREE_HEIGHT_IN_PIXELS * 0.2);
    private int trunkHeight = (int)(Field.TREE_WIDTH_IN_PIXELS * 1.3);
    private int trunkX, trunkY;

    // Bounding area
    private Rectangle boundingRegion;

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;

        trunkX = x + (Field.TREE_WIDTH_IN_PIXELS - trunkWidth) / 2;
        trunkY = y + 2 * (Field.TREE_HEIGHT_IN_PIXELS - trunkHeight);
        boundingRegion = new Rectangle(x, y, Field.TREE_WIDTH_IN_PIXELS, Field.TREE_HEIGHT_IN_PIXELS);
    }

    @Override
    public int getPositionX() {
        return x;
    }

    @Override
    public int getPositionY() {
        return y;
    }

    @Override
    public Rectangle getBoundingRegion() {
        return boundingRegion;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(trunkColor);
        g.fillRect(trunkX, trunkY, trunkWidth, trunkHeight);
        g.setColor(leafColor);
        g.fillOval(x, y, Field.TREE_WIDTH_IN_PIXELS, Field.TREE_HEIGHT_IN_PIXELS);
    }

    @Override
    public boolean isTouching(GamePiece otherPiece) {
        return false;
    }
}
