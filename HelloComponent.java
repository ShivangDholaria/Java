import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloComponent extends JComponent{
    
    public void paintComponent(Graphics g) {
        g.drawString("Hello World in AWT", 100, 100);
    }
    
    public static void main(String[] args) {
        //Creates a window with the title
        JFrame jf = new JFrame("Hello World");
        
        jf.add(new HelloComponent());
        
        //Sets the size of the window
        jf.setSize(300,200);
        
        //Set the visibility of the window
        jf.setVisible(true);
        
        // jf.dispose();
    }
}
