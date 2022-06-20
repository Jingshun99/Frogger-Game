package application;

import controller.MenuController;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.ButtonModel;
import model.MenuModel;
import view.MenuView;

/**
 * {@code Start} is the class that connects
 * {@link MenuModel}, {@link MenuView} and {@link MenuController}.
 * <p>
 * It displays the menu screen of the game.
 * 
 * @author hcyjs2
 *
 */
public class Menu {
	private AnchorPane mainPane;
	/**
	 * The scene.
	 */
	private Scene menuScene; 
	
	/**
	 * The stage.
	 */
	private Stage menuStage = new Stage();
	
	public Menu() {
		
	}
	
	/**
	 * To set up the start screen.
	 * @param menuStage the stage to be presented
	 * @throws Exception if start is not invoked.
	 */
	public void start(final Stage menuStage) throws Exception {
		mainPane =  new AnchorPane();
		ButtonModel start = new ButtonModel("START");
		ButtonModel help = new ButtonModel("HELP");
		ButtonModel exit = new ButtonModel("EXIT");
		Image backgroundImage = new Image("file:src/main/resources/Image/bluebg.png", 256,256,false, true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);

		MenuModel model = new MenuModel();
		model.setStage(menuStage);
		model.setStart(start);
		model.setHelp(help);
		model.setExit(exit);
		model.setBackground(background);
		
		MenuController controller = new MenuController(model);
		MenuView view = new MenuView(model);
		controller.startAction();
		controller.helpAction();
		controller.exitAction();
		
		mainPane.setBackground(new Background(view.startBackground()));
		mainPane.getChildren().addAll(view.startTitle(),view.startLogo(),view.startButton(),view.helpButton(),view.exitButton());
		menuScene = new Scene(mainPane, 600, 800);
		menuStage.setScene(menuScene);
		menuStage.setTitle("Frogger");
		menuStage.setResizable(false);
		menuStage.show();
	}
	
	/**
	 * To run the stage.
	 * @throws Exception if initialize() is not invoked.
	 */
	public void initialize() throws Exception {
		start(menuStage);
	}
	
	
}
