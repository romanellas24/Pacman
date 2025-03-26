package canvas;

import utils.Config;

import java.awt.*;

public class GhostTile extends Tile{

    public GhostTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.RED);
        g.fillOval(this.x * Config.TILE_DIMENSION + 2,
                this.y * Config.TILE_DIMENSION,
                (Config.TILE_DIMENSION / 2),
                (Config.TILE_DIMENSION / 2));

        Rectangle r = new Rectangle(this.x * Config.TILE_DIMENSION  + 2,
                this.y * Config.TILE_DIMENSION + 4,
                (Config.TILE_DIMENSION / 2),
                (Config.TILE_DIMENSION / 2));
        g.setColor(Color.RED);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
    }
}
