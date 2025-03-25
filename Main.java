import canvas.TileDrawer;
import core.GameUpdater;
import utils.Config;
import utils.TimedSocket;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        //Setup
        JFrame window = new JFrame();
        TileDrawer drawer = new TileDrawer();
        window.add(drawer);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, Config.WINDOW_WIDTH, Config.WINDOW_HEIGHT);
        window.setResizable(false);
        window.setTitle("Pacman!");
        window.setVisible(true);

        //Game loop starts here
        int updates = 0;
        int frames = 0;
        TimedSocket updateTimer = new TimedSocket(100);
        TimedSocket seconds = new TimedSocket(1000);
        GameUpdater updater = new GameUpdater();
        window.addKeyListener(updater);
        char[][] frame = null;
        while (true) {
            if(updateTimer.isDelayElapsed()){
                frame = updater.update();
                updates++;
            }

            if(frame == null)
                continue;

            drawer.sendFrame(frame);
            window.repaint();
            frames++;
            if(seconds.isDelayElapsed()){
                System.out.println("Updates: " + updates + "; Frames: " + frames);
                updates = 0;
                frames = 0;
            }
        }

    }

}
