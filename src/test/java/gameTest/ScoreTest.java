package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import general.Score;

/**
 * {@code ScoreTest} is a Junit test case for {@link Score}.
 * 
 * @author hcyjs2
 *
 */
public class ScoreTest {
	
	Score score = new Score();
	
	/**
	 * To test if the method could retrieve the player score. 
	 */
	@Test
	public void getScoreTest() {
		score.setScore(200);
		int playerscore = score.getScore();
		assertEquals(200, playerscore);
	}
	
	/**
	 * To test if the score is incremented when method is invoked.
	 */
	@Test
	public void addScoreTest() {
		score.setScore(200);
		score.addScore(50);
		int playerscore = score.getScore();
		assertEquals(250, playerscore);
	}
	
	/**
	 * To test if the score is deducted when method is invoked.
	 */
	@Test
	public void deductScoreTest() {
		score.setScore(200);
		score.deductScore();
		int playerscore = score.getScore();
		assertEquals(150, playerscore);
	}

}
