package view;

import javafx.scene.layout.BackgroundImage;
import model.ButtonModel;
import model.InstructionModel;

/**
 * {@code InstructionView} receives data and presents 
 * the help screen for display.
 * <p>
 * It is a visual representation of the data 
 * that {@link InstructionModel} contains. 
 * 
 * @author hcyjs2
 *
 */
public class InstructionView {
	/**
	 * The instruction model.
	 */
	private InstructionModel model;
	
	/**
	 * InstructionView constructor.
	 * @param model the model
	 */
	public InstructionView(InstructionModel model) {
		this.model = model;
	}
	
	/**
	 * Set the background image of help screen.
	 * @return background image
	 */
	public BackgroundImage startBackground() {
		BackgroundImage background = model.getBackground();
		return background;
	}
	
	/**
	 * Set the button layout of the help screen.
	 * @return button layout
	 */
	public ButtonModel backButton() {
		ButtonModel back = model.getBack();
		back.setLayoutX(205);
		back.setLayoutY(650);
		return back;
	}
	
}
