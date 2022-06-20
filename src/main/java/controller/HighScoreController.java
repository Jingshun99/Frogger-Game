package controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import general.PlayerInfo;
import model.HighScoreModel;

/**
 * {@code HighScoreController} handles the request of {@link HighScore}.
 * <p>
 * It controls the data flow into model object and updates the view 
 * whenever data changes.
 * 
 * @author hcyjs2
 *
 */
public class HighScoreController {
	private HighScoreModel model;
	public HighScoreController(HighScoreModel model) {
		this.model = model;
	}
	
	/**
	 * Read data from text file and store data in a list.
	 * @return list of player's name and score
	 */
	public List<PlayerInfo> read(int level) { 
		List<PlayerInfo> list=new ArrayList<>();
		if(level==1) {
	        try {    
	            BufferedReader reader = new BufferedReader(new FileReader("HighScore(easy).txt"));
	            reader.readLine();
	            String line = null;    
	            while((line=reader.readLine())!=null){
	            	String item[]=line.split(",");
	                String name = item[0];
	                String credit = item[1];
	                Integer value = Integer.parseInt(credit);
	                PlayerInfo player=new PlayerInfo(name,value);
	                list.add(player);
	            }  
	            reader.close();
	        } catch (Exception e) {    
	            e.printStackTrace();    
	        }	    
        
	        //Sort the list according to player's score.
	        Collections.sort(list, new Comparator<PlayerInfo>() {
	        	@Override
	        	public int compare(PlayerInfo p1, PlayerInfo p2) {
	        		
	        		return p1.getScore().compareTo(p2.getScore());
	        	}
	        });
		}
		
		if(level==2) {
	        try {    
	            BufferedReader reader = new BufferedReader(new FileReader("HighScore(medium).txt"));
	            reader.readLine();
	            String line = null;    
	            while((line=reader.readLine())!=null){
	            	String item[]=line.split(",");
	                String name = item[0];
	                String credit = item[1];
	                Integer value = Integer.parseInt(credit);
	                PlayerInfo player=new PlayerInfo(name,value);
	                list.add(player);
	            }  
	            reader.close();
	        } catch (Exception e) {    
	            e.printStackTrace();    
	        }	    
        
	        //Sort the list according to player's score.
	        Collections.sort(list, new Comparator<PlayerInfo>() {
	        	@Override
	        	public int compare(PlayerInfo p1, PlayerInfo p2) {
	        		
	        		return p1.getScore().compareTo(p2.getScore());
	        	}
	        });
		}
		
		if(level==3) {
	        try {    
	            BufferedReader reader = new BufferedReader(new FileReader("HighScore(hard).txt"));
	            reader.readLine();
	            String line = null;    
	            while((line=reader.readLine())!=null){
	            	String item[]=line.split(",");
	                String name = item[0];
	                String credit = item[1];
	                Integer value = Integer.parseInt(credit);
	                PlayerInfo player=new PlayerInfo(name,value);
	                list.add(player);
	            }  
	            reader.close();
	        } catch (Exception e) {    
	            e.printStackTrace();    
	        }	    
        
	        //Sort the list according to player's score.
	        Collections.sort(list, new Comparator<PlayerInfo>() {
	        	@Override
	        	public int compare(PlayerInfo p1, PlayerInfo p2) {
	        		
	        		return p1.getScore().compareTo(p2.getScore());
	        	}
	        });
		}
			return list;  

	}
}
