package general;

public class Score {
	
	private int score=0;
	private boolean changeDigit=false;
	private boolean scoreChanged=false;
	
	public void setScore(int score) {
		this.score=score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void addScore(int add) {
		this.score=this.score+add;
		scoreChanged=true;
	}
	
	public void deductScore() {
		if (score>50) {
			score-=50;
			changeDigit=true;
		}
		else {
			score=0;
			changeDigit=true;
			
		}
		scoreChanged=true;
	}

	
	public boolean changeScore() {
		if (scoreChanged) {
			scoreChanged = false;
			return true;
		}
		return false;
		
	}
	
	public boolean changeDigit() {
		if (changeDigit) {
			changeDigit = false;
			return true;
		}
		return false;
		
	}

	public void setchangeScore(boolean bool) {
		scoreChanged=bool;	
	}
}
