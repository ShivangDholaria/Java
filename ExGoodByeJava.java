import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

class helloComp extends JComponent implements MouseMotionListener {
    
    String Message;
    int MessageXPos = 250, MessageYPos = 200;
    
    public helloComp(String mes) {
        Message = mes;
        addMouseMotionListener(this);
    } 

    public void paintComponent(Graphics g) {
        g.drawString(Message, MessageXPos, MessageYPos);
    }

    public void mouseDragged(MouseEvent e) {
        MessageXPos = e.getX();
        MessageYPos = e.getY();

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) { }

}


public class ExGoodByeJava {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GoodBye Java Exercise");
        jf.add(new helloComp("Adios Amigos"));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
