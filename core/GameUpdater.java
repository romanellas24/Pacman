package core;

import todo.Player;
import utils.Config;
import utils.Direction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static utils.Config.MIDDLE_COORDINATES;

public class GameUpdater implements KeyListener {

    private Direction playerDirection;
    private Player player;

    public GameUpdater() {
        playerDirection = Direction.STAY;
        player = new Player(MIDDLE_COORDINATES);
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

        player.move(playerDirection);
        player.update();
        playerDirection = Direction.STAY;




        //Retrieving symbols
        this.draw(gameMatrix);
        return gameMatrix;
    }

    public void draw(char[][] gameMatrix){
        int x = player.getCoords().getX();
        int y = player.getCoords().getY();
        gameMatrix[x][y] = player.draw();
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
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
