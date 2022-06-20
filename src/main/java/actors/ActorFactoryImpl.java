package actors;

/**
 * {@code ActorFactoryImpl} is a class that implements Factory design pattern to create actor object in the game.
 * 
 * @author hcyjs2
 *
 */
public class ActorFactoryImpl implements ActorFactory {
	
	/**
	 * To return a specific actor according to the actor type inputted.
	 * @param ActorType the type of actor
	 * @param x the x coordinate of actor
	 * @param y the y coordinate of actor
	 * @param Speed the moving speed of actor
	 * 
	 * @return the corresponding actor object if the ActorType is valid, null otherwise
	 */
	public Actor createActor(String ActorType,int x, int y, double Speed){
		  if(ActorType == null){
			  return null;
		  }
		  else if(ActorType.equalsIgnoreCase("Background")){
			  return new BackgroundImage("file:src/main/resources/Image/Background.png");
	      } 
		  else if(ActorType.equalsIgnoreCase("Log1")){
	    	  return new Log("Log1", 150,x,y, Speed);
	      } 
		  else if(ActorType.equalsIgnoreCase("Log2")){
	    	  return new Log("Log2", 300,x,y, Speed);
	      } 
	      else if(ActorType.equalsIgnoreCase("Turtle")){
	    	  return new Turtle(x, y, Speed,130,130);
	      } 
	      else if(ActorType.equalsIgnoreCase("WetTurtle")){
	    	  return new WetTurtle(x,y,Speed,130,130);
	      }
	      else if(ActorType.equalsIgnoreCase("Truck1")){
			  return new Obstacle("Truck1",x,y,Speed,120,120);
		  }
	      else if(ActorType.equalsIgnoreCase("Truck2")){
	    	  return new Obstacle("Truck2",x,y,Speed,200,200);
		  }
	      else if(ActorType.equalsIgnoreCase("Car")){
	    	  return new Obstacle("Car",x,y,Speed,50,50);
		  }
	      else if(ActorType.equalsIgnoreCase("Snake")){
	    	  return new Snake(x,y,Speed,50,50);
		  }
	      else if(ActorType.equalsIgnoreCase("CrocodileHead")){
			  return new CrocodileHead(x,y,Speed, 40, 40);
		  }
	      else if(ActorType.equalsIgnoreCase("CrocodileBody")){
			  return new CrocodileBody(x,y,Speed,80,80);
		  }
	      else if(ActorType.equalsIgnoreCase("End")){
			  return new End(x, y);
		  }
	      else if(ActorType.equalsIgnoreCase("Digit")){
				  return new Digit(0,30, x, y);
	      }
	      return null;
	}	  
}
