package actors;

import javafx.scene.image.Image;

/**
 * {@code Life} is a subclass of {@link Actor}.
 * <p>
 * It represents the life of player in the game.
 * @author hcyjs2
 *
 */
public class Life extends Actor{

	@Override
	public void act(long now) {
	}
	
	/**
	 * To set the Life image in the game.
	 * @param x the x coordinate of the image
	 * @param y the y coordinate of the image
	 */
	public Life(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/main/resources/Image/life.png", 20, 20, true, true));
	}

}
