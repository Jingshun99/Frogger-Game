package model;

import javafx.scene.layout.BackgroundImage;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * {@code LevelSelectionModel} is a class that keeps the 
 * data model of {@code Level}.
 * @author hcyjs2
 *
 */
public class LevelSelectionModel implements Model{
	private Stage stage;
	private BackgroundImage background;
	private ImageView easy;
	private ImageView medium;
	private ImageView hard;
	
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
	 * To get the background image.
	 * @return background image
	 */
	public BackgroundImage getBackground() {
		return background;
	}
	
	/**
	 * To set the background image.
	 * @param background the background image
	 */
	public void setBackground(BackgroundImage background) {
		this.background = background;
	}
	
	/**
	 * To set the easy level selection image.
	 * @param easy the easy level image
	 */
	public void setEasy(ImageView easy) {
		this.easy = easy;
	}
	
	/**
	 * To set the medium level selection image.
	 * @param medium the medium level image
	 */
	public void setMedium(ImageView medium) {
		this.medium = medium;
	}
	
	/**
	 * To set the hard level selection image.
	 * @param medium the hard level image
	 */
	public void setHard(ImageView hard) {
		this.hard = hard;
	}
	
	/**
	 * To get the easy level selection image.
	 * @return easy level image
	 */
	public ImageView getEasy() {
		return easy;
	}
	
	/**
	 * To get the medium level selection image.
	 * @return medium level image
	 */
	public ImageView getMedium() {
		return medium;
	}
	
	/**
	 * To get the hard level selection image.
	 * @return hard level image
	 */
	public ImageView getHard() {
		return hard;
	}
	
}
