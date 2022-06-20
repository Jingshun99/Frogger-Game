package model;

import javafx.scene.control.TextField;
import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 * {@code NameModel} is a class that keeps the 
 * data model of {@code NameSubmit}.
 * @author hcyjs2
 *
 */
public class NameModel implements Model{
	private Stage stage;
	private TextField name;
	private BackgroundImage background;
	private ButtonModel submit;
	private int score;
	private int level;

	/**
	 * To set the stage.
	 * @param stage the stage
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	/**
	 * To get the current stage.
	 * @return current stage
	 */
	public Stage getStage() {
		return stage;
	}
	
	/**
	 * To set the background image.
	 * @param background the background image
	 */
	public void setBackground(BackgroundImage background) {
		this.background = background;
	}
	
	/**
	 * To get the background image.
	 * @return background image
	 */
	public BackgroundImage getBackground() {
		return background;
	}
	
	
	public void setSubmit(ButtonModel submit) {
		this.submit = submit;
	}
	
	public ButtonModel getSubmit() {
		return submit;
	}
	
	public void setName(TextField name) {
		this.name = name;
	}
	
	public TextField getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
}
