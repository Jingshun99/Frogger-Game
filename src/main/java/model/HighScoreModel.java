package model;

import javafx.scene.control.Label;
import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 * {@code HighScoreModel} is a class that keeps the 
 * data model of {@code HighScore}.
 * @author hcyjs2
 *
 */
public class HighScoreModel implements Model {
	private Stage stage;
	private int level;
	private BackgroundImage background;
	private Label namelabel;
	private Label scorelabel;
	
	/**
	 * To set the stage.
	 * @param stage the stage
	 */
	@Override
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	/**
	 * To get the current stage.
	 * @return current stage
	 */
	@Override
	public Stage getStage() {
		return stage;
	}
	
	/**
	 * To get the background image.
	 * @return background image
	 */
	@Override
	public BackgroundImage getBackground() {
		return background;
	}
	
	/**
	 * To set the background image.
	 * @param background the background image
	 */
	@Override
	public void setBackground(BackgroundImage background) {
		this.background = background;
	}
	
	/**
	 * To set the game level.
	 * @param level the game level
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * To get the current game level.
	 * @return level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * To get the label of player name.
	 * @return player name label
	 */
	public Label getnameLabel() {
		return namelabel;
	}
	
	/**
	 * To set the label of player name.
	 * @param namelabel the label of player name
	 */
	public void setnameLabel(Label namelabel) {
		this.namelabel = namelabel;
	}

	/**
	 * To get the label of player score.
	 * @return player score label
	 */
	public Label getscoreLabel() {
		return scorelabel;
	}
	
	/**
	 * To set the label of player score.
	 * @param namelabel the label of player score
	 */
	public void setscoreLabel(Label scorelabel) {
		this.scorelabel = scorelabel;
	}	

}
