package model;

import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

/**
 * {@code ButtonModel} is a class that includes the properties
 * of buttons that will be used in the interface. 
 * 
 * @author hcyjs2
 *
 */
public class ButtonModel extends Button {
	
	private final String FONT_PATH ="src/main/resources/Font/kenvector_future.ttf";
	private final String BUTTON_PRESSED_STYLE = "-fx-background-colour: transparent; -fx-background-image:url('file:src/main/resources/Image/green_button_pressed.png');";
	private final String BUTTON_FREE_STYLE = "-fx-background-colour: transparent; -fx-background-image:url('file:src/main/resources/Image/green_button.png');";
	
	/**
	 * The ButtonModel constructor.
	 * @param text text to be displayed on the button
	 */
	public ButtonModel(String text) {
		setText(text);
		setButtonFont();
		setPrefWidth(190);
		setPrefHeight(49);
		setStyle(BUTTON_FREE_STYLE);
		initializeButtonListeners();
	}
	
	/**
	 * To set the text font on the button.
	 */
	private void setButtonFont() {
		
		try {
		setFont(Font.loadFont(new FileInputStream(FONT_PATH),23));
		} catch (FileNotFoundException e) {
			setFont(Font.font("Verdana",23));
		}
	}
	
	/**
	 * To set the button style when it is pressed.
	 */
	private void setButtonPressedStyle() {
		setStyle(BUTTON_PRESSED_STYLE);
		setPrefHeight(45);
		setLayoutY(getLayoutY()+4);
	}
	
	/**
	 * To set the button style when it is released.
	 */
	private void setButtonReleasedStyle() {
		setStyle(BUTTON_FREE_STYLE);
		setPrefHeight(49);
		setLayoutY(getLayoutY()-4);
	}
	
	/**
	 * To set the button style based on the actions done by user.
	 */
	private void initializeButtonListeners() {
		
		setOnMousePressed(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonPressedStyle();
				}
			}
		});
		
		setOnMouseReleased(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonReleasedStyle();
				}
			}
		});
		
		setOnMouseEntered(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				setEffect(new DropShadow());
			}
		});
		
		setOnMouseExited(new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent event) {
				setEffect(null);
			}
		});
		
		
		
	}
	
	
}
