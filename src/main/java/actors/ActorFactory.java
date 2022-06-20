package actors;

/**
 * An interface to be implemented to create the actors in the game.
 * 
 * @author hcyjs2
 *
 */
public interface ActorFactory {
	
	public Actor createActor(String ActorType,int x, int y, double Speed);
}
