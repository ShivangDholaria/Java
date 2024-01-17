

import javax.swing.*;

public class AppleToss extends JFrame {
    Field field = new Field();
    Physicist player = new Physicist();

    public AppleToss() {
        super("Apple Toss Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        
        setupFieldForOnePlayer();    
    }

    public void setupFieldForOnePlayer() {
        player.setPosition(100, 500);
        field.setupPlayer(player);
        player.setField(field);
        field.setupTree();
        add(field);
    }

    public static void main(String[] args) {
        AppleToss game = new AppleToss();
        game.setVisible(true);
    }
}
