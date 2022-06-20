package actors;

import javafx.scene.image.Image;

 /**
  * This class is a subclass of Actor.
  * <p>
  * It is used to display the score of the game.
  * 
  * @author hcyjs2
  *
  */
public class Digit extends Actor{
	/**
	 * The dimension of image. 
	 */
	private int dim;
	
	/**
	 * The image.
	 */
	private Image image;
	
	@Override
	public void act(long now) {
		
	}
	
	/**
	 * To set the digit image as score in the game.
	 * @param num the number to be set from 0 to 9
	 * @param dim the dimension of the digit image
	 * @param x the x coordinate of the image
	 * @param y the y coordinate of the image
	 */
	public Digit(int num, int dim, int x, int y) {
		image = new Image("file:src/main/resources/Image/"+num+".png", this.dim, this.dim, true, true);
		setImage(image);
		setX(x);
		setY(y);
	}
	
}
