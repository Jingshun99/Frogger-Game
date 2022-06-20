package application;

import controller.NameController;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ButtonModel;
import model.NameModel;
import view.NameView;


/**
 * {@code NameSubmit} is the class that connects
 * {@link NameModel}, {@link NameView} and {@link NameController}.
 * <p>
 * It displays the name submission screen of the game.
 * 
 * @author hcyjs2
 *
 */
public class NameSubmit {
	private AnchorPane mainPane;
	/**
	 * The scene.
	 */
	private Scene submitScene; 
	private int score;
	private int level;
	/**
	 * The stage.
	 */
	private Stage submitStage = new Stage();
	
	public NameSubmit(int score, int level) {
		this.score = score;
		this.level = level;
	}
	
	/**
	 * To set up the name submission screen.
	 * @param submitStage the stage to be presented
	 * @throws Exception if start is not invoked.
	 */
	public void start(final Stage submitStage) throws Exception {
		mainPane =  new AnchorPane();
		ButtonModel submit = new ButtonModel("SUBMIT");
		TextField field = new TextField();
		Image backgroundImage = new Image("file:src/main/resources/Image/purplebg.png", 256, 256, false, true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
		
		NameModel model = new NameModel();
		model.setStage(submitStage);
		model.setSubmit(submit);
		model.setName(field);
		model.setBackground(background);
		model.setScore(score);
		model.setLevel(level);
		
		NameController controller = new NameController(model);
		NameView view = new NameView(model);
		controller.submitAction();
		
		mainPane.setBackground(new Background(view.submitBackground()));
		mainPane.getChildren().addAll(view.submitTitle(),view.submitBox(),view.submitButton());
		submitScene = new Scene(mainPane, 600, 800);
		submitStage.setScene(submitScene);
		submitStage.setTitle("Entering Name...");
		submitStage.setResizable(false);
		submitStage.show();
	}
	
	/**
	 * To run the stage.
	 * @throws Exception if initialize() is not invoked.
	 */
	public void initialize() throws Exception {
		start(submitStage);
	}
}
