package view;


import controller.HighScoreController;

import java.util.List;

//import general.ReadFile;
import general.PlayerInfo;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import model.HighScoreModel;

/**
 * {@code HighScoreView} receives data and presents 
 * the high score screen for display.
 * <p>
 * It is a visual representation of the data 
 * that {@link HighScoreModel} contains. 
 * 
 * @author hcyjs2
 *
 */
public class HighScoreView {
	/**
	 * The high score model.
	 */
	private HighScoreModel model;
	/**
	 * HighScoreView constructor.
	 * @param model the model
	 */
	public HighScoreView(HighScoreModel model) {
		this.model = model;
	}
	
	HighScoreController read = new HighScoreController(model);
	
	/**
	 * Set the layout for player's name label.
	 * @return name label layout
	 */
	public Label nameLabel() {
		Label namelabel=model.getnameLabel();
		List<PlayerInfo> dataList = read.read(model.getLevel());
		namelabel=new Label(dataList.get(dataList.size()-1).toStringName()+ "\n"
				  +dataList.get(dataList.size()-2).toStringName()+ "\n"
				  +dataList.get(dataList.size()-3).toStringName()+ "\n"
				  +dataList.get(dataList.size()-4).toStringName()+ "\n"
				  +dataList.get(dataList.size()-5).toStringName()+ "\n"
				  +dataList.get(dataList.size()-6).toStringName()+ "\n"
				  +dataList.get(dataList.size()-7).toStringName()+ "\n"
				  +dataList.get(dataList.size()-8).toStringName()+ "\n"
				  +dataList.get(dataList.size()-9).toStringName()+ "\n"
				  +dataList.get(dataList.size()-10).toStringName()+ "\n");
		namelabel.setFont(Font.font("Verdana",46));
		namelabel.setTextFill(Color.web("#666699"));
		namelabel.setLayoutX(250);
		namelabel.setLayoutY(170);
		return namelabel;
	}

	/**
	 * Set the layout for player's score label.
	 * @return score label layout
	 */
	public Label scoreLabel() {
		Label scorelabel=model.getscoreLabel();
		List<PlayerInfo> dataList = read.read(model.getLevel());
		scorelabel=new Label(dataList.get(dataList.size()-1).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-2).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-3).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-4).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-5).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-6).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-7).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-8).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-9).toStringScore()+ "\n"
				  +dataList.get(dataList.size()-10).toStringScore()+ "\n");
		scorelabel.setFont(Font.font("Verdana",46));
		scorelabel.setTextFill(Color.web("#666699"));
		scorelabel.setLayoutX(480);
		scorelabel.setLayoutY(170);
		return scorelabel;
	}

	/**
	 * Set the background image of high score screen.
	 * @return background image
	 */
	public BackgroundImage startBackground() {
		BackgroundImage background = model.getBackground();
		return background;
	}
	
	/**
	 * Set the title layout of high score screen.
	 * @return title layout
	 */
	public ImageView HIscoreTitle() {
		ImageView title = new ImageView("file:src/main/resources/Image/hiscoretitle.png");
		title.setLayoutX(146);
		title.setLayoutY(10);
		return title;
	}
	
	/**
	 * Set the ranking layout of high score screen.
	 * @return ranking layout
	 */
	public ImageView RankTitle() {
		ImageView rank = new ImageView("file:src/main/resources/Image/Rank.png");
		rank.setLayoutX(40);
		rank.setLayoutY(130);
		return rank;
	}
	
}
