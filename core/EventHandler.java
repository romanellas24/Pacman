package core;

import abstracts.Drawable;
import todo.Food;
import todo.Player;
import todo.Wall;

public class EventHandler {

    public void handleCollision(Player player, Drawable drawable) {
        if(drawable instanceof Food) handleCollision(player, (Food) drawable);
        if(drawable instanceof Wall) handleCollision(player, (Wall) drawable);
    }

    public void handleCollision(Player player, Food food) {
        food.markAsDeleted();
    }

    public void handleCollision(Player player, Wall wall) {
        if(wall.getCoords().equals(player.getCoords())) {
            player.resetCoordinates();
        }
    }

}
