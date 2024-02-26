import java.awt.Color;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame obj = new JFrame ();

        Snake game = new Snake();
        obj.setBounds(10 ,10 ,905 ,700 );
        obj.setTitle("Snake Game");
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);
    }

}