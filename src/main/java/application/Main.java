package application;
	
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The main class that enable the game to run.
 * 
 * @author hcyjs2
 *
 */
public class Main extends Application {
	
	/**
	 * To setup the main entry point of the game.
	 * 
	 * @param primaryStage the stage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Menu start = new Menu();
			start.initialize();
			//primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
