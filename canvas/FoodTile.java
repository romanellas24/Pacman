package canvas;

import utils.Config;

import java.awt.*;

public class FoodTile extends Tile{

    public FoodTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.ORANGE);
        g.fillOval(this.x * Config.TILE_DIMENSION + Config.TILE_DIMENSION / 3,
                this.y * Config.TILE_DIMENSION + Config.TILE_DIMENSION / 3,
                Config.TILE_DIMENSION / 3,
                Config.TILE_DIMENSION / 3);
    }
}
