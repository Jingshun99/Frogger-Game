package general;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * {@code Music} is a subclass of {@link World}.
 * <p>
 * It handles the background music.
 * 
 * @author hcyjs2
 *
 */
public class Music extends World{
	MediaPlayer mediaPlayer;
	@Override
	public void act(long now) {
		
	}
	
	public Music() {
		
	}
	
	/**
	 * To play the music.
	 */
	public void playMusic() {
		String musicFile = "src/main/resources/Music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * To stop the music.
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
