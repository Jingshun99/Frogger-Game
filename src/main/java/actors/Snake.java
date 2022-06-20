package actors;

import javafx.scene.image.Image;

/**
 * {@code Snake} is a subclass of {@link Actor}.
 * <p>
 * Contact with snake causes frog to lose life.
 * 
 * @author hcyjs2 
 *
 */
public class Snake extends Actor{
	
	/**
	 * The image of snake at different time stamp.
	 */
	private Image snake1;
	/**
	 * The image of snake at different time stamp.
	 */
	private Image snake2;
	/**
	 * The image of snake at different time stamp.
	 */
	private Image snake3;
	/**
	 * The moving speed of snake.
	 */
	private double speed;
	
	/**
	 * To define the snake behavior in the game.
	 */
	@Override
	public void act(long now) {
		if (now/100000000  % 3 ==0) {
			setImage(snake1);					
		}
		else if (now/100000000 % 3 == 1) {
			setImage(snake2);
			
		}
		else if (now/100000000 %3 == 2) {
			setImage(snake3);				
		}
	
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-180);
	}
	
	/**
	 * To set the moving snake animation in the game.
	 * @param xpos the x coordinate of snake image
	 * @param ypos the y coordinate of snake image
	 * @param speed the moving speed of snake
	 * @param w the width of image
	 * @param h the height of image
	 */
	public Snake(int xpos, int ypos, double speed, int w, int h) {
		snake1 = new Image("file:src/main/resources/Image/snake1.png", w, h, true, true);
		snake2 = new Image("file:src/main/resources/Image/snake2.png", w, h, true, true);
		snake3 = new Image("file:src/main/resources/Image/snake3.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		this.speed = speed;
		setImage(snake1);
	}
	
}
