package application;

import controller.InstructionController;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.stage.Stage;
import model.ButtonModel;
import model.InstructionModel;

import view.InstructionView;

/**
 * {@code Instruction} is the class that connects
 * {@link InstructionModel} and {@link InstructionView}.
 * <p>
 * It displays the help screen of the game.
 * 
 * @author hcyjs2
 *
 */
public class Instruction {
	private AnchorPane mainPane;
	/**
	 * The scene.
	 */
	private Scene helpScene; 
	
	/**
	 * The stage.
	 */
	private Stage helpStage = new Stage();
	
	public Instruction() {
		
	}
	
	/**
	 * To set up the help screen.
	 * @param helpStage the stage to be presented
	 * @throws Exception if start is not invoked.
	 */
	public void start(final Stage helpStage) throws Exception {
		mainPane =  new AnchorPane();
		ButtonModel back = new ButtonModel("BACK");
		Image backgroundImage = new Image("file:src/main/resources/Image/helpbg.png", 600, 800, false, true);
		BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

		InstructionModel model = new InstructionModel();
		model.setStage(helpStage);
		model.setBackground(background);
		model.setBack(back);
		
		InstructionView view = new InstructionView(model);
		InstructionController controller = new InstructionController(model);
		controller.backAction();
		mainPane.setBackground(new Background(view.startBackground()));
		mainPane.getChildren().addAll(view.backButton());
		helpScene = new Scene(mainPane, 600, 800);
		helpStage.setScene(helpScene);
		helpStage.setTitle("Instruction");
		helpStage.setResizable(false);
		helpStage.show();
	}
	
	/**
	 * To run the stage.
	 * @throws Exception if initialize() is not invoked.
	 */
	public void initialize() throws Exception {
		start(helpStage);
	}
	
	
}


