package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import general.PlayerInfo;

/**
 * {@code PlayerInfoTest} is a Junit test case for {@link PlayerInfo}.
 * 
 * @author hcyjs2
 *
 */
public class PlayerInfoTest {
	
	/**
	 * Set the name and score of player.
	 */
	PlayerInfo player = new PlayerInfo("Player1",200);
	
	/**
	 * To test if the player name is the same as the name being set.
	 */
	@Test
	public void getNameTest() {
		String name = player.getName();
		assertEquals("Player1", name);
	}
	
	/**
	 * To test if the player score is the same as the score being set.
	 */
	@Test
	public void getScoreTest() {
		int score = player.getScore();
		assertEquals(200,score);
	}
	
	/**
	 * To test if the player name data type is converted to String.
	 */
	@Test
	public void toStringNameTest() {
		String name = player.toStringName();
		assertEquals("Player1", name);
	}
	
	/**
	 * To test if the player score data type is converted to String.
	 */
	@Test
	public void toStringScoreTest() {
		String name = player.toStringScore();
		assertEquals("200", name);
	}
	

}
