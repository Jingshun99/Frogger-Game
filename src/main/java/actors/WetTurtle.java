package actors;

import javafx.scene.image.Image;

/**
 * {@code WetTurtle} is a subclass of {@link Actor}.
 * <p>
 * The frog can stand on the turtles
 * to cross the river before the turtles 
 * go below the surface.
 * 
 * @author hcyjs2
 *
 */
public class WetTurtle extends Actor{
	/**
	 * The image of turtle at different time stamp.
	 */
	private Image turtle1;
	
	/**
	 * The image of turtle at different time stamp.
	 */
	private Image turtle2;
	
	/**
	 * The image of turtle at different time stamp.
	 */
	private Image turtle3;
	
	/**
	 * The image of turtle at different time stamp.
	 */
	private Image turtle4;
	
	/**
	 * The moving speed of turtle.
	 */
	private double speed;
	
	/**
	 * The flag to determine whether the turtle goes
	 * below the water surface.
	 */
	private boolean sunk = false;
	
	/**
	 * To define the wet turtle behavior in the game. 
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 4 ==0) {
					setImage(turtle2);
					sunk = false;
					
				}
				else if (now/900000000 % 4 == 1) {
					setImage(turtle1);
					sunk = false;
				}
				else if (now/900000000 %4 == 2) {
					setImage(turtle3);
					sunk = false;
				} else if (now/900000000 %4 == 3) {
					setImage(turtle4);
					sunk = true;
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * To set the moving wet turtle animation in the game.
	 * @param xpos the x coordinate of wet turtle image
	 * @param ypos the y coordinate of wet turtle image
	 * @param s the moving speed of wet turtle
	 * @param w the width of image
	 * @param h the height of image
	 */
	public WetTurtle(int xpos, int ypos, double s, int w, int h) {
		turtle1 = new Image("file:src/main/resources/Image/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/main/resources/Image/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:src/main/resources/Image/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:src/main/resources/Image/TurtleAnimation4Wet.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	/**
	 * To determine whether turtle goes below the water surface.
	 * @return {@code true} if sunk, {@code false} otherwise
	 */
	public boolean isSunk() {
		return sunk;
	}
}
