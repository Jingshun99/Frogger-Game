package application;

import controller.LevelController;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.LevelSelectionModel;

import view.LevelView;


/**
 * {@code Level} is the class that connects
 * {@link LevelSelectionModel}, {@link LevelView} and {@link LevelController}.
 * <p>
 * It displays the level selection screen of the game.
 * 
 * @author hcyjs2
 *
 */
public class Level {
	private AnchorPane mainPane;
	/**
	 * The scene.
	 */
	private Scene levelScene; 
	
	/**
	 * The stage.
	 */
	private Stage levelStage = new Stage();
	
	public Level() {
	
	}
	
	/**
	 * To set up the level selection screen.
	 * @param levelStage the stage to be presented
	 * @throws Exception if start is not invoked.
	 */
	public void start(final Stage levelStage) throws Exception {
		mainPane =  new AnchorPane();
		ImageView easy = new ImageView("file:src/main/resources/Image/easylevel.png");
		ImageView medium =  new ImageView("file:src/main/resources/Image/mediumlevel.png");
		ImageView hard = new ImageView("file:src/main/resources/Image/hardlevel.png");
		Image backgroundImage = new Image("file:src/main/resources/Image/levelbg.png", 256,256,false, true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);

		LevelSelectionModel model = new LevelSelectionModel();
		model.setStage(levelStage);
		model.setEasy(easy);
		model.setMedium(medium);
		model.setHard(hard);
		model.setBackground(background);
		
		LevelController controller = new LevelController(model);
		LevelView view = new LevelView(model);
		controller.easyAction();
		controller.mediumAction();
		controller.hardAction();
		
		mainPane.setBackground(new Background(view.levelBackground()));
		mainPane.getChildren().addAll(view.levelTitle(),view.easyLevel(),view.mediumLevel(),view.hardLevel());
		levelScene = new Scene(mainPane, 600, 800);
		levelStage.setScene(levelScene);
		levelStage.setTitle("Level Selection");
		levelStage.setResizable(false);
		levelStage.show();
	}
	
	/**
	 * To run the stage.
	 * @throws Exception if initialize() is not invoked.
	 */
	public void initialize() throws Exception {
		start(levelStage);
	}
}
