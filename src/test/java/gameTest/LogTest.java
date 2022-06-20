package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actors.Log;

/**
 * {@code LogTest} is a Junit test case for {@link Log}.
 * 
 * @author hcyjs2
 *
 */
public class LogTest {
	
	/**
	 * To test the log behavior when log exceeds the x coordinate limit to the right.
	 */
	@Test
	public void logRightTest() {
		Log log = new Log("", 0, 599, 0, 1);
		log.act(0);
		assertEquals(600, log.getX());
		log.act(0);
		assertEquals(-180, log.getX());
		log.act(0);
		assertEquals(0, log.getY());
	}
	
	/**
	 * To test the log behavior when log exceeds the x coordinate limit to the left.
	 */
	@Test
	public void logLeftTest() {
		Log log = new Log("", 0, -299, 0, -1);
		log.act(0);
		assertEquals(-300, log.getX());
		log.act(0);
		assertEquals(700, log.getX());
		log.act(0);
		assertEquals(0, log.getY());
	}

}
