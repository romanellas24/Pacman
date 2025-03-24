package canvas;

import utils.Config;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {

    private int x;
    private int y;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Rectangle r = new Rectangle(this.x * Config.TILE_DIMENSION, this.y * Config.TILE_DIMENSION, Config.TILE_DIMENSION, Config.TILE_DIMENSION);
        g.setColor(Color.BLACK);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
    }
}
