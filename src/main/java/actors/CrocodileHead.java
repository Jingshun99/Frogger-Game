package actors;

import javafx.scene.image.Image;

/**
 * {@code CrocodileHead} is a subclass of {@link Actor}.
 * <p>
 * Stepping on crocodile's head might kill the frog.
 * 
 * @author hcyjs2 
 *
 */
public class CrocodileHead extends Actor{
	/**
     * The image of a mouth opening crocodile.
     */
	private Image crocodileOpen;
	/**
     * The image of a mouth closing crocodile.
     */
	private Image crocodileClosed;
	/**
	 * The moving speed of crocodile.
	 */
	private double speed;
	

	/**
	 * To define the crocodile head behavior in the game.
	 */
	@Override
    public void act(long now) {
        if (now / 900000000 % 2 == 0) {
            setImage(crocodileOpen);
        } else if (now / 900000000 % 2 == 1) {
            setImage(crocodileClosed);
        }
        
        move(speed, 0);
        if (getX() > 600 && speed > 0)
            setX(-190);
        if (getX() < -75 && speed < 0)
            setX(600);
    }
	
	/**
	 * To set the moving crocodile animation in the game.
	 * @param xpos the x coordinate of crocodile head image
	 * @param ypos the y coordinate of crocodile head image
	 * @param s the moving speed of crocodile
	 * @param w the width of image
	 * @param h the height of image
	 */
	 public CrocodileHead(int xpos, int ypos, double s, int w, int h) {
	        crocodileOpen = new Image("file:src/main/resources/Image/crocodileHeadOpen.png", w, h, true, true);
	        crocodileClosed = new Image("file:src/main/resources/Image/crocodileHeadClosed.png", w, h, true, true);
	        setX(xpos);
	        setY(ypos);
	        speed = s;
	        setImage(crocodileOpen);
	    }
}
