package actors;

import javafx.scene.image.Image;

/**
 * {@code End} is a subclass of {@link Actor}.
 * <p>
 * It is the destination of {@link Frog}.
 * @author hcyjs2
 *
 */
public class End extends Actor{
	/**
	 * A flag to determine whether the end is occupied by the frogs.
	 */
	private boolean activated = false;
	
	@Override
	public void act(long now) {
	
	}
	
	/**
	 * To set the End image as the destination of frog in the game.
	 * @param x the x coordinate of the image
	 * @param y the y coordinate of the image
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/main/resources/Image/End.png", 60, 60, true, true));
	}
	
	/**
	 * To set the image when frog reaches the destination.
	 */
	public void setEnd() {
		setImage(new Image("file:src/main/resources/Image/FrogEnd.png", 60, 70, true, true));
		activated = true;
	}
	
	/**
	 * To determine whether frog has reached the destination.
	 * @return {@code true} if frog reaches the end, {@code false} otherwise
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
