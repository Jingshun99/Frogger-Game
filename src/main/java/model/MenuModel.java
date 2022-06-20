package model;


import model.ButtonModel;
import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 * {@code StartModel} is a class that keeps the 
 * data model of {@code Start}.
 * @author hcyjs2
 *
 */
public class MenuModel implements Model{
	private Stage stage;
	private ButtonModel start;
	private ButtonModel help;
	private ButtonModel exit;
	private BackgroundImage background;
	
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
	 * To get the start button.
	 * @return start button
	 */
	public ButtonModel getStart() {
		return start;
	}
	
	/**
	 * To set the start button.
	 * @param start the start button
	 */
	public void setStart(ButtonModel start) {
		this.start= start;
	}
	
	/**
	 * To get the help button.
	 * @return help button
	 */
	public ButtonModel getHelp() {
		return help;
	}
	
	/**
	 * To set the help button.
	 * @param help the help button
	 */
	public void setHelp(ButtonModel help) {
		this.help = help;
	}
	
	/**
	 * To get the exit button.
	 * @return exit button
	 */
	public ButtonModel getExit() {
		return exit;
	}
	
	/**
	 * To set the exit button.
	 * @param exit the exit button
	 */
	public void setExit(ButtonModel exit) {
		this.exit = exit;
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
	
}
