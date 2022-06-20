package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actors.Snake;
import javafx.embed.swing.JFXPanel;

/**
 * {@code SnakeTest} is a Junit test case for {@link Snake}.
 * 
 * @author hcyjs2
 *
 */
class SnakeTest {
	private JFXPanel panel = new JFXPanel();

	/**
	 * To test the snake behavior when snake exceeds the x coordinate limit to the right.
	 */
	@Test
	public void actTest() {
		Snake testSnake = new Snake(600, 0, 1, 0, 0);
		testSnake.act(0);
		assertEquals(-180,testSnake.getX());
		assertEquals(0, testSnake.getY());
	}
}
