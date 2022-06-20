package controller;

import application.Instruction;
import application.Level;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.MenuModel;

/**
 * {@code MenuController} handles the request of {@link Menu}.
 * <p>
 * It controls the data flow into model object and updates the view 
 * whenever data changes.
 * 
 * @author hcyjs2
 *
 */
public class MenuController {
	/**
	 * The menu model.
	 */
	private MenuModel model;
	
	/**
	 * MenuController constructor.
	 * @param model the model
	 */
	public MenuController(MenuModel model) {
		this.model=model;
	}
	
	/**
	 * To set the actions when player clicks the start button.
	 */
	public void startAction() {
		model.getStart().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Level level = new Level();
				try {
					level.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * To set the actions when player clicks the help button.
	 */
	public void helpAction() {
		model.getHelp().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Instruction help = new Instruction();
				try {
					help.initialize();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * To set the actions when player clicks the exit button.
	 */
	public void exitAction() {
		model.getExit().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				model.getStage().close();
			}
		});
	}
	
	
		
		
		
		
	}
