package actors;

import javafx.scene.image.Image;

/**
 * {@code BackgroundImage} is a subclass of {@link Actor}.
 * <p>
 * It sets the background image of the interface.
 * 
 * @author hcyjs2
 *
 */
public class BackgroundImage extends Actor{

	@Override
	public void act(long now) {
		
	}
	
	/**
	 * Set the background image.
	 * @param imageLink the path of the image file
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, false, true));
		
	}

}
