package canvas;

import utils.Config;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class TileDrawer extends JPanel {
    private LinkedList<Tile> tiles;

    public TileDrawer() {
        tiles = new LinkedList<>();
        for (int i = 0; i < Config.TILE_HEIGHT_LENGTH; i++)
            for (int j = 0; j < Config.TILE_WIDTH_LENGTH; j++)
                tiles.add(new Tile(j, i));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Tile tile : tiles) {
            tile.draw(g);
        }
    }
}
