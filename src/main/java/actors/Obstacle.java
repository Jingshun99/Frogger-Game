package actors;

import javafx.scene.image.Image;

/**
 * {@code Obstacle} is a subclass of {@link Actor}.
 * <p>
 * The cars and trucks act as an obstacle in the game.
 * 
 * @author hcyjs2 
 *
 */
public class Obstacle extends Actor {
	/**
	 * The moving speed of obstacle.
	 */
	private double speed;
	
	/**
	 * The obstacle behavior in the game.
	 * 
	 * @param now the time stamp
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
	
	/**
	 * To set the moving animation of obstacle in game.
	 * @param obs the type of obstacle
	 * @param xpos the x coordinate of obstacle image
	 * @param ypos the y coordinate of obstacle image
	 * @param speed the moving speed of obstacle
	 * @param w the width of image
	 * @param h the height of image
	 */
	public Obstacle(String obs, int xpos, int ypos, double speed, int w, int h) {
		switch(obs) {
		case "Truck1":
			setImage(new Image("file:src/main/resources/Image/truck1Right.png", w, h, true, true));
			break;
		case "Truck2":
			setImage(new Image("file:src/main/resources/Image/truck2Right.png", w, h, true, true));
			break;
		case "Car":
			setImage(new Image("file:src/main/resources/Image/car1Left.png", w, h, true, true));
			break;
		default:
			break;
	}
		setX(xpos);
		setY(ypos);
		this.speed = speed;
	}

}
