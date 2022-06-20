package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import application.HighScore;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.NameModel;

/**
 * {@code NameController} handles the request of {@link NameSubmit}.
 * <p>
 * It controls the data flow into model object and updates the view 
 * whenever data changes.
 * 
 * @author hcyjs2
 *
 */
public class NameController {
	/**
	 * The name model.
	 */
	private NameModel model;
	//private Frog frog;
	/**
	 * NameController constructor.
	 * @param model
	 */
	public NameController(NameModel model) {
		this.model=model;
	}
	
	/**
	 * To set the actions when submit button is clicked.
	 */
	public void submitAction(){
		model.getSubmit().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(model.getLevel()==1) {
					try {
						File file=new File("HighScore(easy).txt");
						if(!file.exists()) {
							file.createNewFile();
						}
					}
					catch(IOException e) {
						e.printStackTrace();
					}
					try {
						FileWriter filewriter=new FileWriter("HighScore(easy).txt",true);
						PrintWriter text = new PrintWriter(filewriter);
						text.println(model.getName().getText()+","+Integer.toString(model.getScore()));
						text.flush();
						filewriter.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					HighScore hiscore = new HighScore(1);
					try {
						hiscore.initialize();
					} catch (Exception e) {
						e.printStackTrace();
					}
					model.getStage().close();
				}
				
				if(model.getLevel()==2) {
					try {
						File file=new File("HighScore(medium).txt");
						if(!file.exists()) {
							file.createNewFile();
						}
					}
					catch(IOException e) {
						e.printStackTrace();
					}
					try {
						FileWriter filewriter=new FileWriter("HighScore(medium).txt",true);
						PrintWriter text = new PrintWriter(filewriter);
						text.println(model.getName().getText()+","+Integer.toString(model.getScore()));
						text.flush();
						filewriter.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					HighScore hiscore = new HighScore(2);
					try {
						hiscore.initialize();
					} catch (Exception e) {
						e.printStackTrace();
					}
					model.getStage().close();
				}
				
				if(model.getLevel()==3) {
					try {
						File file=new File("HighScore(hard).txt");
						if(!file.exists()) {
							file.createNewFile();
						}
					}
					catch(IOException e) {
						e.printStackTrace();
					}
					try {
						FileWriter filewriter=new FileWriter("HighScore(hard).txt",true);
						PrintWriter text = new PrintWriter(filewriter);
						text.println(model.getName().getText()+","+Integer.toString(model.getScore()));
						text.flush();
						filewriter.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					HighScore hiscore = new HighScore(3);
					try {
						hiscore.initialize();
					} catch (Exception e) {
						e.printStackTrace();
					}
					model.getStage().close();
				}
				
			}
				
		});
	}
}
