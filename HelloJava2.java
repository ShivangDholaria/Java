import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class HelloComponent1 extends JComponent implements MouseMotionListener{
    String message;
    int mesXPos = 100, mesYPos = 100;

    //Def constructor
    public HelloComponent1(String mes) {
        message = mes;

        // Attaches the current object, ie, HelloComponent1 obj, 
        // to the MouseMotionListener interface since this class
        // handles all the GUI stuff
        addMouseMotionListener(this);
    }

    //Adding string to the window
    public void paintComponent(Graphics g) {
        g.drawString(message, mesXPos, mesYPos);
    }

    // Called when mouse is moved with any of the button pressed
    // Updates the message position dynamically
    public void mouseDragged(MouseEvent e) {
        mesXPos = e.getX();
        mesYPos = e.getY();

        repaint();
    }

    // Called when mouse is moved without any of the button pressed
    public void mouseMoved(MouseEvent e) { }
}

public class HelloJava2 {
    public static void main(String[] args) {
        // Def window component initialization
        JFrame jf = new JFrame("HelloJava2");
        jf.add(new HelloComponent1("Hello java 2"));

        // Closing the process when closing the window
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
