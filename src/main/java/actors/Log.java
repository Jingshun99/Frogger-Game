package actors;

import javafx.scene.image.Image;

/**
 * {@code Log} is a subclass of {@link Actor}.
 * <p>
 * The frog can stand on the logs to cross the river.
 * @author hcyjs2
 *
 */
public class Log extends Actor {
	
	/**
	 * The moving speed of log.
	 */
	private double speed;
	
	/**
	 * To define the log behavior in the game.
	 * @param now the time stamp
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	
	/**
	 * To set the moving log animation in the game.
	 * @param log the type of log
	 * @param size the size of log image
	 * @param xpos the x coordinate of image
	 * @param ypos the y coordinate of image
	 * @param s the moving speed of log
	 */
	public Log(String log, int size, int xpos, int ypos, double s) {
		switch(log) {
		case "Log1":
			setImage(new Image("file:src/main/resources/Image/log3.png", size,size, true, true));
			break;
		case "Log2":
			setImage(new Image("file:src/main/resources/Image/logs.png", size,size, true, true));
			break;
		default:
			break;
	}
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	
	/**
	 * To determine whether logs move to the left.
	 * @return {@code true} if left, {@code false} otherwise
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
