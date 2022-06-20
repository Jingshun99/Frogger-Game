package view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import model.LevelSelectionModel;

/**
 * {@code LevelView} receives data and presents 
 * the level selection screen for display.
 * <p>
 * It is a visual representation of the data 
 * that {@link LevelSelectionModel} contains. 
 * 
 * @author hcyjs2
 *
 */
public class LevelView {
	/**
	 * The level selection model
	 */
	private LevelSelectionModel model;
	
	/**
	 * LevelView constructor
	 * @param model the model
	 */
	public LevelView(LevelSelectionModel model) {
		this.model = model;
	}
	
	/**
	 * Set the title layout of level selection screen.
	 * @return the title layout
	 */
	public ImageView levelTitle() {
		ImageView title = new ImageView("file:src/main/resources/Image/leveltitle.png");
		title.setLayoutX(20);
		title.setLayoutY(10);
		title.setFitWidth(300);
		return title;
	}
	
	/**
	 * Set the background image of level selection screen.
	 * @return background image
	 */
	public BackgroundImage levelBackground() {
		BackgroundImage background = model.getBackground();
		return background;
	}
	
	/**
	 * Set the button layout for easy level.
	 * @return the button layout
	 */
	public ImageView easyLevel() {
		ImageView easy = model.getEasy();
		easy.setLayoutX(200);
		easy.setLayoutY(100);
		easy.setFitHeight(200);
		easy.setFitWidth(200);
		return easy;
	}
	
	/**
	 * Set the button layout for medium level.
	 * @return the button layout
	 */
	public ImageView mediumLevel() {
		ImageView medium = model.getMedium();
		medium.setLayoutX(200);
		medium.setLayoutY(350);
		medium.setFitHeight(200);
		medium.setFitWidth(200);
		return medium;
	}
	
	/**
	 * Set the button layout for hard level.
	 * @return the button layout
	 */
	public ImageView hardLevel() {
		ImageView hard = model.getHard();
		hard.setLayoutX(200);
		hard.setLayoutY(600);
		hard.setFitHeight(200);
		hard.setFitWidth(200);
		return hard;
	}
}
