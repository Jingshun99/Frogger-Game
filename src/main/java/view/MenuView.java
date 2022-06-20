package view;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import model.ButtonModel;
import model.MenuModel;

/**
 * {@code MenuView} receives data and presents the menu screen for display.
 * <p>
 * It is a visual representation of the data 
 * that {@link MenuModel} contains. 
 * 
 * @author hcyjs2
 *
 */
public class MenuView {
	/**
	 * The menu model.
	 */
	private MenuModel model;
	
	/**
	 * MenuView constructor.
	 * @param model the menu model
	 */
	public MenuView(MenuModel model) {
		this.model = model;
	}
	
	/**
	 * Set the layout for start button.
	 * @return start button layout
	 */
	public ButtonModel startButton() {
		ButtonModel start = model.getStart();
		start.setLayoutX(205);
		start.setLayoutY(420);
		return start;
	}
	
	/**
	 * Set the layout for help button.
	 * @return help button layout
	 */
	public ButtonModel helpButton() {
		ButtonModel help = model.getHelp();
		help.setLayoutX(205);
		help.setLayoutY(518);
		return help;
	}
	
	/**
	 * Set the layout for exit button.
	 * @return exit button layout
	 */
	public ButtonModel exitButton() {
		ButtonModel exit = model.getExit();
		exit.setLayoutX(205);
		exit.setLayoutY(616);
		return exit;
	}
	
	/**
	 * Set the background image.
	 * @return background image
	 */
	public BackgroundImage startBackground() {
		BackgroundImage background = model.getBackground();
		return background;
	}
	
	/**
	 * Set the title of the start screen.
	 * @return title
	 */
	public ImageView startTitle() {
		ImageView title = new ImageView("file:src/main/resources/Image/froggertitle.png");
		title.setLayoutX(120);
		title.setLayoutY(80);
		return title;
	}
	
	/**
	 * Set the logo of the start screen.
	 * @return logo
	 */
	public ImageView startLogo() {
		ImageView logo = new ImageView("file:src/main/resources/Image/froggerlogo.png");
		logo.setLayoutX(180);
		logo.setLayoutY(220);
		return logo;
	}
	
	
}
