package application;

import actors.Frog;
import actors.ActorFactoryImpl;
import actors.Digit;
import actors.Life;
import general.Music;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * {@code Game} is an important class that handles the game base functions for the game to run. 
 * <p>
 * It includes the layout of the game and the detailed functions that enable the game to be playable. 
 * @author hcyjs2
 *
 */
public class Game{
	/**
	 * The timer.
	 */
	private AnimationTimer timer;
	
	/**
	 * The game base.
	 */
	private Music background;
	
	/**
	 * The frog that player controls.
	 */
	private Frog frog;
	
	/**
	 * The game scene.
	 */
	private Scene gameScene;
	
	/**
	 * The stage.
	 */
	private Stage gameStage;
	
	/**
	 * First life sprite.
	 */
	private Life life1 = new Life(10,760);
	
	/**
	 * Second life sprite.
	 */
	private Life life2 = new Life(40,760);
	
	/**
	 * Third life sprite.
	 */
	private Life life3= new Life(70,760);
	
	/**
	 * The moving speed of obstacles.
	 */
	private double obstacleSpeed;
	
	/**
	 * The game level.
	 */
	private int level;
	
	/**
	 * The actor factory.
	 */
	ActorFactoryImpl factory = new ActorFactoryImpl();
	
	
	public Game() { 

	}
	
	/**
	 * To setup the interface for the entire game play.
	 */
	public void initializeStage(){
	    background = new Music();
	    gameScene  = new Scene(background,600,800);
	    gameStage = new Stage();
	    gameStage.setTitle("Frogger");
	    gameStage.setResizable(false);
	    gameStage.setScene(gameScene);
		gameStage.show();
		background.start();
		start(); 
		gameStage.setOnCloseRequest((EventHandler<WindowEvent>) new EventHandler<WindowEvent>() {
			public void handle(WindowEvent event) {
				background.stopMusic();
			}
		});
	}
	
	/**
	 * The game layout of easy level.
	 */
	public void easyLevel() {
		level = 1;
		obstacleSpeed=0.5;
		initializeStage();
		gameBase(factory);
	    frog = new Frog("file:src/main/resources/Image/froggerUp.png"); 
		ImageView easy = new ImageView("file:src/main/resources/Image/easylogo.png");
		easy.setLayoutX(450);
		easy.setLayoutY(755);
		background.getChildren().add(easy);
		background.add(frog);
	}
	
	/**
	 * The game layout of medium level.
	 */
	public void mediumLevel() {
		level = 2;
		obstacleSpeed=1;
		initializeStage();
		gameBase(factory);
	    ImageView medium = new ImageView("file:src/main/resources/Image/mediumlogo.png");
		medium.setLayoutX(410);
		medium.setLayoutY(755);
		medium.setFitHeight(30);
		medium.setFitWidth(170);
		background.getChildren().add(medium);
		background.add(factory.createActor("Snake", 600,435,2));
		background.add(factory.createActor("Car", 250, 597, -obstacleSpeed));
		background.add(factory.createActor("Car", 550, 597, -obstacleSpeed));
		background.add(frog);
	}
	
	/**
	 * The game layout of hard level.
	 */
	public void hardLevel() {
		level = 3;
		obstacleSpeed=2;
		initializeStage();
		gameBase(factory);
		ImageView hard = new ImageView("file:src/main/resources/Image/hardlogo.png");
		hard.setLayoutX(430);
		hard.setLayoutY(753);
		hard.setFitHeight(40);
		hard.setFitWidth(160);
		background.getChildren().add(hard);
		background.add(factory.createActor("Snake", 600,435,3));
		background.add(factory.createActor("CrocodileHead", 80, 166, 0.76));
		background.add(factory.createActor("CrocodileBody", 0, 166, 0.76));
		background.add(factory.createActor("Car", 250, 597, -obstacleSpeed));
		background.add(factory.createActor("Car", 550, 597, -obstacleSpeed));
		background.add(frog);
	}
	
	/**
	 * The base layout of the entire game.
	 */
	public void gameBase(ActorFactoryImpl factory) {
	    frog = new Frog("file:src/main/resources/Image/froggerUp.png"); 
		background.add(factory.createActor("Background", 0, 0, 0));
		background.add(factory.createActor("Log1", 600, 166, 0.75));
		background.add(factory.createActor("Log1", 140, 166, 0.75));
		background.add(factory.createActor("Log1", 360, 166, 0.75));
		background.add(factory.createActor("Log2", 0, 276, -2));
		background.add(factory.createActor("Log2", 400, 276, -2));
		background.add(factory.createActor("Log1", 50, 329, 0.75));
		background.add(factory.createActor("Log1", 270, 329, 0.75));
		background.add(factory.createActor("Log1", 490, 329, 0.75));

		
		background.add(factory.createActor ("Turtle",500, 376, -1));
		background.add(factory.createActor ("Turtle",300, 376, -1));
		background.add(factory.createActor ("WetTurtle",700, 376, -1));
		background.add(factory.createActor ("WetTurtle",600, 217, -1));
		background.add(factory.createActor ("WetTurtle",400, 217, -1));
		background.add(factory.createActor ("WetTurtle",200, 217, -1));
	
		background.add(factory.createActor ("End",10,96,0));
		background.add(factory.createActor ("End",135,96,0));
		background.add(factory.createActor ("End",265,96,0));
		background.add(factory.createActor ("End",394,96,0));
		background.add(factory.createActor ("End",520,96,0));

		background.add(factory.createActor("Truck1", 0, 649, obstacleSpeed));
		background.add(factory.createActor("Truck1", 300, 649, obstacleSpeed));
		background.add(factory.createActor("Truck1", 600, 649,obstacleSpeed));
	
		background.add(factory.createActor("Car", 100, 597, -obstacleSpeed));
		background.add(factory.createActor("Car", 400, 597, -obstacleSpeed));
		background.add(factory.createActor("Truck2", 0, 540, obstacleSpeed));
		background.add(factory.createActor("Truck2", 500, 540, obstacleSpeed));
		background.add(factory.createActor("Car", 500, 490, -5*obstacleSpeed));
		background.add(factory.createActor ("Digit", 240, 760, 0));
		background.add(factory.createActor ("Digit", 270, 760, 0));
		background.add(factory.createActor ("Digit", 300, 760, 0));
		background.add(factory.createActor ("Digit", 330, 760, 0));
		background.add(life1);
		background.add(life2);
		background.add(life3);
	}
	
	/**
	 * To create the timer for the game.
	 */
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	
            	if (frog.ChangeScore()) {
            		setDigit(frog.getScore());
            	}
            	
            	if(frog.changeDeath()) {
            		removeLife();
            	}
            	
            	if(frog.getdeathNum()==3) {
            		gameLost();
            	}
            	
            	if(frog.isPause()==true) {
            		pause();
            	}
            	
            	if(frog.isResume()==true) {
            		resume();
            	}
            	
            	if (frog.getStop()) {
            		background.stopMusic();
            		stop();
            		background.stop();
            		gameStage.close();
            		NameSubmit name = new NameSubmit(frog.getScore(),getLevel());
                	try {
            			name.initialize();
            		} catch (Exception e) {
            			e.printStackTrace();
            		}
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+frog.getScore()+"!");
            		alert.show();
            	}
            	
            }
        };
    }
	
	/**
	 * To start the game.
	 */
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

	/**
	 * To stop the game.
	 */
    public void stop() {
    	background.stopMusic();
        timer.stop();
    }
    
    /**
     * To display the scores.
     * @param n the score 
     */
    public void setDigit(int n) {
    	int shift = 0;
    	if(frog.ChangeDigit()) {
    		background.add(new Digit(0, 30, 300 - shift, 760));
    	}
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 330 - shift, 760));
    		  background.add(new Digit(0, 30, 300 - shift, 760));
    		  shift+=30;
    		}
    }
    
    /**
     * To remove life sprite if conditions are met.
     */
    public void removeLife() {
    	if (frog.getdeathNum()==1) {
    		background.remove(life3);
    	}
    	if (frog.getdeathNum()==2) {
    		background.remove(life2);
    	}
    	if (frog.getdeathNum()==3) {
    		background.remove(life1);
    	}
    }
    
    /**
     * To set the game actions to be done when the player loses the game.
     */
    public void gameLost() {
    	stop();
    	background.stop();
    	background.stopMusic();
    	gameStage.close();
    	NameSubmit name = new NameSubmit(frog.getScore(),getLevel());
    	try {
			name.initialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("You Have Lost The Game!");
		alert.setHeaderText("Your High Score: "+frog.getScore()+"!");
		alert.show();
    }
    
    /**
     * To pause the game.
     */
    public void pause() {
    	background.stop();
    	frog.setPause(false);
    	frog.disableMove();
    }
    
    /**
     * To resume the game.
     */
    public void resume() {
    	background.resume();
    	frog.setResume(false);
    	frog.enableMove();
    }
    
    /**
     * To get the game level.
     * @return game level
     */
    public int getLevel() {
    	return level;
    }
}

