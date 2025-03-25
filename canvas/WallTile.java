package canvas;

import utils.Config;

import java.awt.*;

public class WallTile extends Tile {

    public WallTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        color = new Color(0, 34, 150);
        g.setColor(color);
        Rectangle r = new Rectangle(this.x * Config.TILE_DIMENSION,
                this.y * Config.TILE_DIMENSION,
                (Config.TILE_DIMENSION - 2) / 2,
                (Config.TILE_DIMENSION - 2) / 2);
        g.setColor(color);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());

        r = new Rectangle(this.x * Config.TILE_DIMENSION + (Config.TILE_DIMENSION) / 2,
                this.y * Config.TILE_DIMENSION,
                (Config.TILE_DIMENSION - 2) / 2,
                (Config.TILE_DIMENSION - 2) / 2);
        g.setColor(color);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());

        r = new Rectangle(this.x * Config.TILE_DIMENSION,
                this.y * Config.TILE_DIMENSION + (Config.TILE_DIMENSION) / 2,
                (Config.TILE_DIMENSION - 2) / 2,
                (Config.TILE_DIMENSION - 2) / 2);
        g.setColor(color);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());

        r = new Rectangle(this.x * Config.TILE_DIMENSION + (Config.TILE_DIMENSION) / 2,
                this.y * Config.TILE_DIMENSION + (Config.TILE_DIMENSION) / 2,
                (Config.TILE_DIMENSION - 2) / 2,
                (Config.TILE_DIMENSION - 2) / 2);
        g.setColor(color);
        g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());
    }
}
