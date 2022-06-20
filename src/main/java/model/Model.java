package model;

import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 * An interface to be implemented by the model class.
 * 
 * @author hcyjs2
 *
 */
public interface Model {

	/**
	 * To set the stage.
	 * @param stage the stage
	 */
	public void setStage(Stage stage);

	/**
	 * To get the current stage.
	 * @return current stage
	 */
	public Stage getStage();

	/**
	 * To get the background image.
	 * @return background image
	 */
	public BackgroundImage getBackground();

	/**
	 * To set the background image.
	 * @param background the background image
	 */
	public void setBackground(BackgroundImage background);

}