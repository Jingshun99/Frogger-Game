package controller;

import application.Instruction;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.InstructionModel;

/**
 * {@code InstructionController} handles the request of {@link Instruction}.
 * <p>
 * It controls the data flow into model object and updates the view 
 * whenever data changes.
 * 
 * @author hcyjs2
 *
 */
public class InstructionController {
	/**
	 * The instruction model.
	 */
	private InstructionModel model;
	
	/**
	 * InstructionController constructor.
	 * @param model the model
	 */
	public InstructionController(InstructionModel model) {
		this.model=model;
	}
	
	/**
	 * To set the actions when player clicks the back button.
	 */
	public void backAction() {
		model.getBack().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				model.getStage().close();
			}
		});
	}
		
}
