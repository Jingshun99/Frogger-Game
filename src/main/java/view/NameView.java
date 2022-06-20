package view;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import model.ButtonModel;
import model.NameModel;

/**
 * {@code NameView} receives data and presents 
 * the name submission screen for display.
 * <p>
 * It is a visual representation of the data 
 * that {@link NameModel} contains. 
 * 
 * @author hcyjs2
 *
 */
public class NameView {
	/**
	 * The name model.
	 */
	private NameModel model;
	
	/**
	 * NameView constructor.
	 * @param model the model
	 */
	public NameView(NameModel model) {
		this.model=model;
	}
	
	/**
	 * Set the layout for submit button.
	 * @return submit button layout
	 */
	public ButtonModel submitButton() {
		ButtonModel submit = model.getSubmit();
		submit.setLayoutX(205);
		submit.setLayoutY(420);
		return submit;
	}
	
	/**
	 * Set the background image of name submission screen.
	 * @return background image
	 */
	public BackgroundImage submitBackground() {
		BackgroundImage background = model.getBackground();
		return background;
	}
	
	/**
	 * Set the title layout of name submission screen.
	 * @return title layout
	 */
	public ImageView submitTitle() {
		ImageView title = new ImageView("file:src/main/resources/Image/Nametitle.png");
		title.setLayoutX(35);
		title.setLayoutY(150);
		return title;
	}
	
	/**
	 * Set the layout for text box.
	 * @return text box layout
	 */
	public TextField submitBox() {
		TextField field = model.getName();
		field.setLayoutX(150);
		field.setLayoutY(300);
		field.setAlignment(Pos.CENTER);
		field.setPrefHeight(40);
		field.setPrefWidth(300);
		return field;
	}
}
