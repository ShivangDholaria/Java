
/**
 * Apple class
 */
import java.awt.*;

public class ExApple implements GamePiece{
    float mass, diameter = 1.0f;
    int x, y, size;

    public static final int SMALL = 0;
    public static final int MEDIUM = 1;    
    public static final int LARGE = 2;

    int centerX, centerY, scaledLength;

    Rectangle boundingRegion;
    GamePiece collided;

    public ExApple() {
        this(MEDIUM);
    }

    public ExApple(int size) {
        setSize(size);
    }

    public void setSize(int size) {
        if (size < SMALL)
            size = SMALL;

        if (size > LARGE)
            size = LARGE;
    
        this.size = size;

        switch (size) {
            case SMALL:
                diameter = 0.9f;
                mass = 0.5f;
                break;
            case MEDIUM:
                mass = diameter = 1.0f;
                break;
            case LARGE:
                diameter = 1.3f;
                mass = 1.7f;
                break;
        }

        scaledLength = (int)(diameter * Field.APPLE_SIZE_IN_PIXELS + 0.5);
        boundingRegion = new Rectangle(x, y, scaledLength, scaledLength);
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public void setPosition(int x, int y) {

        int offset = (int)(diameter * Field.APPLE_SIZE_IN_PIXELS / 2);

        this.centerX = x;
        this.centerY = y;
        this.x = x - offset;
        this.y = y - offset;

        boundingRegion = new Rectangle(x, y, scaledLength, scaledLength);
    }

    @Override
    public int getPositionX() {
        return centerX;
    }

    @Override
    public int getPositionY() {
        return centerY;
    }

    @Override
    public Rectangle getBoundingRegion() {
        return boundingRegion;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, scaledLength, scaledLength);
    }

    public boolean isTouching(GamePiece other) {
        double xdiff = x - other.getPositionX();
        double ydiff = y - other.getPositionY();
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);

        if (distance < diameter)
            return true;
        else
            return false;
    }

    public void printDetails() {
        System.out.println("Mass: " + mass);
        String names[] = getAppleSizes();

        if (diameter < 5.0f) 
            System.out.println(names[SMALL]);
        else if (diameter < 10.0f) 
            System.out.println(names[MEDIUM]);
        else
            System.out.println(names[LARGE]);
        
        System.out.println("Position: (" + x + ", " + y +")");
    }

    public String[] getAppleSizes() {
        return new String[] {"SMALL", "MEDIUM", "LARGE"};
    }
}
