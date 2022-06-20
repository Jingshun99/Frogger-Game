package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actors.Obstacle;

/**
 * {@code ObstacleTest} is a Junit test case for {@link Obstacle}.
 * 
 * @author hcyjs2
 *
 */
public class ObstacleTest {
	
	/**
	 * To test the obstacle behavior when obstacle exceeds the x coordinate limit to the right.
	 */
	@Test
	public void obstacleRightTest() {
		Obstacle obstacle = new Obstacle("", 599, 0, 1, 0, 0);
		obstacle.act(0);
		assertEquals(600, obstacle.getX());
		obstacle.act(0);
		assertEquals(-200, obstacle.getX());
		assertEquals(0, obstacle.getY());
	}
	
	/**
	 * To test the obstacle behavior when obstacle exceeds the x coordinate limit to the left.
	 */
	@Test
	public void obstacleLeftTest() {
		Obstacle obstacle = new Obstacle("", -49, 0, -1, 0, 0);
		obstacle.act(0);
		assertEquals(-50, obstacle.getX());
		obstacle.act(0);
		assertEquals(600, obstacle.getX());
		assertEquals(0, obstacle.getY());
	}

}
