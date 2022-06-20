package controller;

import application.Game;
import model.LevelSelectionModel;

/**
 * {@code LevelController} handles the request of {@link Level}.
 * <p>
 * It controls the data flow into model object and updates the view 
 * whenever data changes.
 * 
 * @author hcyjs2
 *
 */
public class LevelController {
	/**
	 * The level model
	 */
	private LevelSelectionModel model;
	
	/**
	 * LevelController constructor
	 * @param model the model
	 */
	public LevelController(LevelSelectionModel model) {
		this.model=model;
	}
	
	/**
	 * To set the actions when player selects easy level.
	 */
	public void easyAction() {
		model.getEasy().setOnMouseClicked(e -> {
			Game game = new Game();
			game.easyLevel();
			model.getStage().close();
		});
	}
	
	/**
	 * To set the actions when player selects medium level.
	 */
	public void mediumAction() {
		model.getMedium().setOnMouseClicked(e -> {
			Game game = new Game();
			game.mediumLevel();
			model.getStage().close();
		});
	}
	
	/**
	 * To set the actions when player selects hard level.
	 */
	public void hardAction() {
		model.getHard().setOnMouseClicked(e -> {
			Game game = new Game();
			game.hardLevel();
			model.getStage().close();
		});
	}
		
}
