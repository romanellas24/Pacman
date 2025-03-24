import canvas.TileDrawer;
import utils.Config;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.add(new TileDrawer());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        window.setResizable(false);
        window.setTitle("Pacman!");
        window.setVisible(true);
    }

}
