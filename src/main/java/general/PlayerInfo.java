package general;

/**
 * {@code PlayerInfo} handles player's name and score in the game.
 * 
 * @author hcyjs2
 *
 */
public class PlayerInfo{
	/**
	 * The name of player.
	 */
	private String name;
	
	/**
	 * The score of player.
	 */
	private Integer score;

	/**
	 * PlayerInfo constructor.
	 * @param name player name
	 * @param score player score
	 */
	public PlayerInfo(String name, int score) {
		this.name=name;
		this.score=score;
	}

	/**
	 * Get player name.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set player name.
	 * @param name player name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get player score.
	 * @return score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * Set player score.
	 * @param score player score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * Convert data type of name to String
	 * @return name
	 */
	public String toStringName() {
		return name;
	}
	
	/**
	 * Convert data type of score to String
	 * @return score
	 */
	public String toStringScore() {
		return ""+score;
	}

}
