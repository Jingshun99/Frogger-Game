package actors;

import java.util.ArrayList;

import general.Score;
import javafx.event.EventHandler;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * {@code Frog} is a subclass of {@link Actor}.
 * <p>
 * It is controlled by the player in the game.
 * @author hcyjs2
 *
 */
public class Frog extends Actor {
	/**
	 * Image of frog moving up.
	 */
	private Image imgW1;
	
	/**
	 * Image of frog moving left.
	 */
	private Image imgA1;
	
	/**
	 * Image of frog moving down.
	 */
	private Image imgS1;
	
	/**
	 * Image of frog moving right.
	 */
	private Image imgD1;
	
	/**
	 * Image of frog jumps while moving up.
	 */
	private Image imgW2;
	
	/**
	 * Image of frog jumps while moving left.
	 */
	private Image imgA2;
	
	/**
	 * Image of frog jumps while moving down.
	 */
	private Image imgS2;
	
	/**
	 * Image of frog jumps while moving right.
	 */
	private Image imgD2;
	
	/**
	 * The score of player.
	 */
	private Score score = new Score();
	
	/**
	 * A flag to determine whether frog has jumped.
	 */
	private boolean second = false;
	
	/**
	 * A flag to determine whether frog is dead.
	 */
	private boolean changedeath=false;
	
	/**
	 * A flag to determine whether game is paused.
	 */
	private boolean pause = false;
	
	/**
	 * A flag to determine whether game is resumed.
	 */
	private boolean resume = false;
	
	/**
	 * A flag to determine whether frog has moved.
	 */
	private boolean noMove = false;
	
	/**
	 * A flag to determine whether car causes death.
	 */
	private boolean carDeath = false;
	
	/**
	 * A flag to determine whether water causes death.
	 */
	private boolean waterDeath = false;
	
	/**
	 * The movement scale of frog in the vertical direction.
	 */
	private double movementY = 26.6;
	
	/**
	 * The movement scale of frog in the horizontal direction.
	 */
	private double movementX = 21.4;
	
	/**
	 * The current coordinate of Y coordinate.
	 */
	private double currentY = 800;
	
	/**
	 * The size of image.
	 */
	private int imgSize = 40;
	
	/**
	 * The end count.
	 */
	private int end = 0;
	
	/**
	 * The number of death.
	 */
	private int deathNum=0;
	
	/**
	 * A count to display death scene when frog dies.
	 */
	private int carD = 0;
	
	/**
	 * A flag to determine whether game shall stop.
	 */
	public boolean stop = false;
	
	/**
	 * ArrayList of End.
	 */
	ArrayList<End> inter = new ArrayList<End>();
	
	/**
	 * Set the image of frog.
	 * @param imageLink the path of the image file
	 */
	public Frog(String imageLink) {
		setImage(new Image(imageLink, imgSize, imgSize, true, true));
		InitSpot();
		imgW1 = new Image("file:src/main/resources/Image/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:src/main/resources/Image/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:src/main/resources/Image/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:src/main/resources/Image/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:src/main/resources/Image/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:src/main/resources/Image/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:src/main/resources/Image/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:src/main/resources/Image/froggerRightJump.png", imgSize, imgSize, true, true);
		
		/**
		 * Set actions when key is pressed.
		 */
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				if (noMove) {
					if (event.getCode() == KeyCode.R) {
		            	 setResume(true);
					}
				}
				else {
				if (second) {
					if (event.getCode() == KeyCode.W) {	  
		                moveUpPressed();
		            }
		            else if (event.getCode() == KeyCode.A) {	            	
		            	moveLeft();
		            }
		            else if (event.getCode() == KeyCode.S) {	            	
		            	moveDown();
		            }
		            else if (event.getCode() == KeyCode.D) {	            	
		            	moveRight();
		            }
				}
				else if (event.getCode() == KeyCode.W) {	            	
	                moveUpJump();
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	moveLeftJump();
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	moveDownJump();
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	moveRightJump();
	            }
	            else if (event.getCode() == KeyCode.P) {
	            	 isPause();
	            }
	            else if (event.getCode() == KeyCode.R) {
	            	 isResume();
	            }
	        }
			}
		});	
		
		/**
		 * Set actions when key is released.
		 */
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (noMove) {
					if (event.getCode() == KeyCode.R) {
		            	 setResume(true);
					}
				}
				else {
				if (event.getCode() == KeyCode.W) {	  
					moveUpReleased();
	            }
	            else if (event.getCode() == KeyCode.A) {	            	
	            	moveLeft();
	            }
	            else if (event.getCode() == KeyCode.S) {	            	
	            	moveDown();
	            }
	            else if (event.getCode() == KeyCode.D) {	            	
	            	moveRight();
	            }
	            else if (event.getCode() == KeyCode.P) {
	            	 setPause(true);
	            }
	            else if (event.getCode() == KeyCode.R) {
	            	 setResume(true);
	            }
	        }
			}
			
		});
	}
	
	/**
	 * To define the frog's behavior and actions in the game.
	 * 
	 * @param now the time stamp
	 */
	@Override
	public void act(long now) {
		if (getY()<0 || getY()>734) {
			InitSpot();
		}
		if (getX()<0) {
			move(movementY*2, 0);
		}
		
		
		if (carDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/main/resources/Image/cardeath1.png", imgSize, imgSize, true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/main/resources/Image/cardeath2.png", imgSize, imgSize, true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/main/resources/Image/cardeath3.png", imgSize, imgSize, true, true));
			}
			if (carD == 4) {
				setDeath();
			}

			
		}
		if (waterDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/main/resources/Image/waterdeath1.png", imgSize,imgSize , true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/main/resources/Image/waterdeath2.png", imgSize,imgSize , true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/main/resources/Image/waterdeath3.png", imgSize,imgSize , true, true));
			}
			if (carD == 4) {
				setImage(new Image("file:src/main/resources/Image/waterdeath4.png", imgSize,imgSize , true, true));
			}
			if (carD == 5) {
				setDeath();
			}
				
		}
		
		if (getX()>600) {
			move(-movementY*2, 0);
		}
		if (getIntersectingObjects(Obstacle.class).size() >= 1 || getIntersectingObjects(Snake.class).size() >= 1) {
			carDeath = true;
		}
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		if (getIntersectingObjects(Log.class).size() >= 1 && !noMove) {
			if(getIntersectingObjects(Log.class).get(0).getLeft())
				move(-2,0);
			else
				move (.75,0);
		}
		else if (getIntersectingObjects(CrocodileHead.class).size() >= 1 && !noMove) {
			carDeath = true;
		}

		else if (getIntersectingObjects(CrocodileBody.class).size() >= 1 && !noMove) {
			move(0.75, 0);
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) {
			move(-1,0);
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				waterDeath = true;
			} else {
				move(-1,0);
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				deathNum++;
				changedeath=true;
				end--;
				score.deductScore();
			}
				score.addScore(50);
				currentY=800;
				getIntersectingObjects(End.class).get(0).setEnd();
				end++;
				InitSpot();
		}
		else if (getY()<413){
			waterDeath = true;
		}
	
		
	}
	
	/**
	 * To locate frog in initial position.
	 */
	public void InitSpot() {
		setX(300);
		setY(679.8+movementY);
	}
	
	/**
	 * To define the frog behavior when 'W' key is pressed.
	 */
	public void moveUpPressed() {
		move(0, -movementY);
        score.setchangeScore(false);;
        setImage(imgW1);
        second = false;
	}
	
	/**
	 * To define the frog behavior after 'W' key is pressed.
	 */
	public void moveUpJump() {
		move(0, -movementY);
        setImage(imgW2);
        second = true;
	}
	
	/**
	 * To define the frog behavior when 'W' key is released.
	 */
	public void moveUpReleased() {
		if (getY() < currentY) {
			currentY = getY();
			score.addScore(10);
		}
        move(0, -movementY);
        setImage(imgW1);
        second = false;
	}
	
	/**
	 * To define the frog behavior when 'A' key is pressed.
	 */
	public void moveLeft() {
		move(-movementX, 0);
   	 	setImage(imgA1);
   	 	second = false;
	}
	
	/**
	 * To define the frog behavior after 'A' key is pressed.
	 */
	public void moveLeftJump() {
		 move(-movementX, 0);
    	 setImage(imgA2);
    	 second = true;
	}
	
	/**
	 * To define the frog behavior when 'S' key is pressed.
	 */
	public void moveDown() {
		move(0, movementY);
   	 	setImage(imgS1);
   	 	second = false;
	}
	
	/**
	 * To define the frog behavior after 'S' key is pressed.
	 */
	public void moveDownJump() {
		move(0, movementY);
   	 	setImage(imgS2);
   	 	second = true;
	}
	
	/**
	 * To define the frog behavior when 'D' key is pressed.
	 */
	public void moveRight() {
		move(movementX, 0);
   	 	setImage(imgD1);
   	 	second = false;
	}
	
	/**
	 * To define the frog behavior after 'D' key is pressed.
	 */
	public void moveRightJump() {
		move(movementX, 0);
   	 	setImage(imgD2);
   	 	second = true;
	}
	
	
	/**
	 * To determine whether win condition is met.
	 * @return {@code true} if end equals to 5, {@code false} otherwise
	 */
	public boolean getStop() {
		return end==5;
	}
	
	/**
	 * To determine whether death status has changed.
	 * @return {@code true} if death status changed, {@code false} otherwise
	 */
	public boolean changeDeath() {
		if(changedeath) {
			changedeath = false;
			return true;
		}
		return false;
	}
	
	/**
	 * Get the number of death of frog.
	 * @return the number of death of frog
	 */
	public int getdeathNum() {
		return deathNum;
	}
	
	/**
	 * To set the game behavior when the frog dies.
	 */
	public void setDeath() {
		InitSpot();
		currentY=800;
		deathNum++;
		changedeath=true;
		carDeath = waterDeath = false;
		carD = 0;
		setImage(new Image("file:src/main/resources/Image/froggerUp.png", imgSize, imgSize, true, true));
		noMove = false;
		score.deductScore();
	}
	
	/**
	 * To determine whether the game is paused.
	 * @return {@code true} if paused, {@code false} otherwise
	 */
	public boolean isPause() {
		return pause;
	}
	
	/**
	 * To set the pause flag.
	 * @param pause pause flag
	 */
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	
	/**
	 * To determine whether the game is resumed.
	 * @return {@code true} if resumed, {@code false} otherwise
	 */
	public boolean isResume() {
		return resume;
	}

	/**
	 * To set the resume flag.
	 * @param resume resume flag
	 */
	public void setResume(boolean resume) {
		this.resume = resume;
	}
	
	/**
	 * To disable the movement of frog.
	 */
	public void disableMove() {
		noMove=true;
	}
	
	/**
	 * To enable the movement of frog.
	 */
	public void enableMove() {
		noMove=false;
	}
	
	/**
	 * To determine whether digit has changed.
	 * @return {@code true} if digit changed, {@code false} otherwise
	 */
	public boolean ChangeDigit() {
		return score.changeDigit();
	}
	
	/**
	 * To determine whether score has changed.
	 * @return {@code true} if score changed, {@code false} otherwise
	 */
	public boolean ChangeScore() {
		return score.changeScore();
	}
	
	/**
	 * To get the current score.
	 * @return current score
	 */
	public int getScore() {
		return score.getScore();
	}
}
