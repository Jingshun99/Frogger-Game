package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actors.Frog;
import javafx.embed.swing.JFXPanel;

/**
 * {@code FrogTest} is a Junit test case for {@link Frog}.
 * 
 * @author hcyjs2
 *
 */
public class FrogTest {
	
	private Frog frog;
	private JFXPanel panel = new JFXPanel();
	
	/**
	 * To test if the frog would return to initial spot if method is called.
	 * 
	 */
	@Test
	public void initspotTest() {
		frog = new Frog("file:src/main/resources/Image/froggerUp.png");
		frog.InitSpot();
		assertEquals(300, frog.getX());
		assertEquals(706.4, frog.getY());
	}
	
	/**
	 * To test if the score is increased when move up button is released.
	 * 
	 */
	@Test
	public void moveUpReleasedTest() {
		frog = new Frog("file:src/main/resources/Image/froggerUp.png");
		frog.moveUpReleased();
		assertEquals(10, frog.getScore());
	}
	
	/**
	 * To test if the frog would return to initial spot,
	 * death number is increased and death status is true 
	 * when the frog is dead. 
	 * 
	 */
	@Test
	public void setdeathTest() {
		frog = new Frog("file:src/main/resources/Image/froggerUp.png");
		frog.setDeath();
		assertEquals(300, frog.getX());
		assertEquals(706.4, frog.getY());
		assertEquals(1, frog.getdeathNum());
		assertEquals(true,frog.changeDeath());
	}
}
