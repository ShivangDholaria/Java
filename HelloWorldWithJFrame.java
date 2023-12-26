import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldWithJFrame {
    public static void main(String[] args) {
        //Creates a window with the title
        JFrame jf = new JFrame("Hello World");
        
        //Add labels to the window
        JLabel jl = new JLabel("Yo  ssup!!!", JLabel.CENTER);
        jf.add(jl);

        //Sets the size of the window
        jf.setSize(300,200);
        
        //Set the visibility of the window
        jf.setVisible(true);
    }
}
