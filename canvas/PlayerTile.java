package canvas;

import utils.Config;

import java.awt.*;

public class PlayerTile extends Tile{

    public PlayerTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.YELLOW);
        g.fillOval(this.x * Config.TILE_DIMENSION, this.y * Config.TILE_DIMENSION, Config.TILE_DIMENSION, Config.TILE_DIMENSION);
    }
}
