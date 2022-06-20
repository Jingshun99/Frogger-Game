package actors;

import javafx.scene.image.Image;

/**
 * {@code CrocodileHead} is a subclass of {@link Actor}.
 * <p>
 * Stepping on crocodile's body helps the frog to cross river.
 * 
 * @author hcyjs2 
 *
 */
public class CrocodileBody extends Actor {
	/**
     * The image of a crocodile body.
     */
    private Image crocodileBody;
    /**
     * The moving speed of crocodile.
     */
    private double speed;
    
    /**
	 * To define the crocodile head behavior in the game.
	 */
    @Override
    public void act(long now) {
        move(speed, 0);
        if (getX() > 600 && speed > 0)
            setX(-190);
        if (getX() < -75 && speed < 0)
            setX(600);
    }

    /**
	 * To set the moving crocodile animation in the game.
	 * @param xpos the x coordinate of crocodile body image
	 * @param ypos the y coordinate of crocodile body image
	 * @param s the moving speed of crocodile
	 * @param w the width of image
	 * @param h the height of image
	 */
    public CrocodileBody(int xpos, int ypos, double s, int w, int h) {
        crocodileBody = new Image("file:src/main/resources/Image/crocodileBody.png", w, h, true, true);
        setX(xpos);
        setY(ypos);
        speed = s;
        setImage(crocodileBody);
    }
}
