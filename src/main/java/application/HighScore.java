package application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.HighScoreModel;
import view.HighScoreView;


/**
 * {@code HighScore} is the class that connects
 * {@link HighScoreModel} and {@link HighScoreView}.
 * <p>
 * It displays the high score screen of the game.
 * 
 * @author hcyjs2
 *
 */
public class HighScore {
	private AnchorPane mainPane;
	/**
	 * The scene.
	 */
	private Scene HIscoreScene; 
	private int level;
	/**
	 * The stage.
	 */
	private Stage HIscoreStage = new Stage();
	
	public HighScore(int level) {
		this.level = level;
	}
	
	/**
	 * To set up the high score screen.
	 * @param HIscoreStage the stage to be presented
	 * @throws Exception if start is not invoked.
	 */
	public void start(final Stage HIscoreStage) throws Exception {
		mainPane =  new AnchorPane();
		Image backgroundImage = new Image("file:src/main/resources/Image/galaxy.png", 600, 800, false, true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);

		HighScoreModel model = new HighScoreModel();
		model.setBackground(background);
		model.setLevel(level);
		HighScoreView view = new HighScoreView(model);
		mainPane.setBackground(new Background(view.startBackground()));
		mainPane.getChildren().addAll(view.HIscoreTitle(),view.RankTitle(),view.nameLabel(),view.scoreLabel());
		HIscoreScene = new Scene(mainPane, 600, 800);
		HIscoreStage.setScene(HIscoreScene);
		HIscoreStage.setTitle("High Score");
		HIscoreStage.setResizable(false);
		HIscoreStage.show();
	}
	
	/**
	 * To run the stage.
	 * @throws Exception if initialize() is not invoked.
	 */
	public void initialize() throws Exception {
		start(HIscoreStage);
	}
	
	
}

