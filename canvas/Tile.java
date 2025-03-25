package canvas;

import utils.Config;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {

    private final int x;
    private final int y;
    private Color color;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.BLACK;
    }

    public void draw(Graphics g) {
        Rectangle r = new Rectangle(this.x * Config.TILE_DIMENSION, this.y * Config.TILE_DIMENSION, Config.TILE_DIMENSION, Config.TILE_DIMENSION);
        g.setColor(color);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
