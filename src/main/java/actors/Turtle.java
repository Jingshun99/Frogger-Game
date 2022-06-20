package actors;

import javafx.scene.image.Image;

/**
 * {@code Turtle} is a subclass of {@link Actor}
 * <p>
 * The frog can stand on the turtles to cross the river. 
 * @author hcyjs2
 *
 */
public class Turtle extends Actor{
	
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
	 * The moving speed of turtle.
	 */
	private double speed;
	
	/**
	 * To define the turtle behavior in the game.
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 3 ==0) {
					setImage(turtle2);
					
				}
				else if (now/900000000 % 3 == 1) {
					setImage(turtle1);
					
				}
				else if (now/900000000 %3 == 2) {
					setImage(turtle3);
					
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * To set the moving turtle animation in the game.
	 * @param xpos the x coordinate of turtle image
	 * @param ypos the y coordinate of turtle image
	 * @param s the moving speed of turtle
	 * @param w the width of image
	 * @param h the height of image
	 */
	public Turtle(int xpos, int ypos, double s, int w, int h) {
		turtle1 = new Image("file:src/main/resources/Image/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/main/resources/Image/TurtleAnimation2.png", w, h, true, true);
		turtle3 = new Image("file:src/main/resources/Image/TurtleAnimation3.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
}
