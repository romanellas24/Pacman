package core;

import abstracts.Drawable;
import todo.Food;
import todo.Player;
import todo.Wall;
import utils.Config;
import utils.Coordinates;
import utils.Direction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import static utils.Config.MIDDLE_COORDINATES;

public class GameUpdater implements KeyListener {

    private Direction playerDirection;
    private final Player player;
    private Food food;
    private Wall wall;
    private final LinkedList<Drawable> drawables;
    private EventHandler eventHandler;

    public GameUpdater() {
        playerDirection = Direction.STAY;
        player = new Player(MIDDLE_COORDINATES);
        food = new Food(new Coordinates(3, 2));
        wall = new Wall(new Coordinates(5, 4));
        drawables = new LinkedList<>();
        eventHandler = new EventHandler();
    }

    private char[][] getVoidMatrix() {
        char[][] gameMatrix = new char[Config.TILE_HEIGHT_LENGTH][Config.TILE_WIDTH_LENGTH]; //Prima la riga, poi la colonna!
        for (int i = 0; i < Config.TILE_HEIGHT_LENGTH; i++)
            for (int j = 0; j < Config.TILE_WIDTH_LENGTH; j++)
                gameMatrix[i][j] = ' ';
        return gameMatrix;
    }

    public char[][] update() {
        char[][] gameMatrix = getVoidMatrix();
        drawables.clear();
        drawables.add(player);
        drawables.add(food); //TODO CHANGE
        drawables.add(wall); //TODO CHANGE
        player.move(playerDirection);

        for(Drawable d: drawables) {
            d.update();
            if(player.getCoords().equals(d.getCoords()))
                eventHandler.handleCollision(player, d);
        }



        playerDirection = Direction.STAY;
        //Retrieving symbols
        this.draw(gameMatrix);
        return gameMatrix;
    }

    public void draw(char[][] gameMatrix) {
        for(Drawable d: drawables) {
            char drawing = d.draw();
            if(drawing == ' ')
                continue;
            int x = d.getCoords().getX();
            int y = d.getCoords().getY();
            gameMatrix[x][y] = drawing;
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                playerDirection = Direction.UP;
                break;
            case KeyEvent.VK_A:
                playerDirection = Direction.LEFT;
                break;
            case KeyEvent.VK_S:
                playerDirection = Direction.DOWN;
                break;
            case KeyEvent.VK_D:
                playerDirection = Direction.RIGHT;
                break;
            default:
                playerDirection = Direction.STAY;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {}

}
