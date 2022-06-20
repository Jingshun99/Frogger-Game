package actors;

import javafx.scene.image.ImageView;
import java.util.ArrayList;
import general.World;

/**
 * {@code Actor} is the parent class of all the actors in the game.
 * <p> 
 * It includes method for actors' movement, getting world,
 * the intersections of actors and  also an abstract method 
 * that will be used by its child class.
 * 
 * @author hcyjs2
 *
 */
public abstract class Actor extends ImageView{

	/**
	 * Set the movement of actors according to x y coordinates
	 * @param dx the change in horizontal movement
	 * @param dy the change in vertical movement
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    /**
     * Get the current world.
     * @return the world
     */
    public World getWorld() {
        return (World) getParent();
    }

    /**
     * Get intersections between actors.
     * @param <A> the type of actors
     * @param cls the actors class
     * @return the ArrayList of intersections between actors
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    /**
     * An abstract method to describe actors' behavior.
     * To be implemented by the child classes.
     * @param now the time stamp
     */
    public abstract void act(long now);

}
