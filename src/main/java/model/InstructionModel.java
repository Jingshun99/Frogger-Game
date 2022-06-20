package model;

import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 * {@code InstructionModel} is a class that keeps the 
 * data model of {@code Instruction}.
 * @author hcyjs2
 *
 */
public class InstructionModel implements Model {
	private Stage stage;
	private BackgroundImage background;
	private ButtonModel back;

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
	 * To set the back button.
	 * @param back the back button
	 */
	public void setBack(ButtonModel back) {
		this.back = back;
	}
	
	/**
	 * To get the back button.
	 * @return back button
	 */
	public ButtonModel getBack() {
		return back;
	}
}
