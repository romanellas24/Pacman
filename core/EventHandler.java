package core;

import abstracts.Drawable;
import todo.Food;
import todo.Player;

public class EventHandler {

    public void handleCollision(Player player, Drawable drawable) {
        if(drawable instanceof Food) handleCollision(player, (Food) drawable);
    }

    public void handleCollision(Player player, Food food) {
        food.markAsDeleted();
    }

}
