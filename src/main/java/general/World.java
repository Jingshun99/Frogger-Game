package general;


import java.util.ArrayList;
import java.util.List;

import actors.Actor;
import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;

/**
 * {@code World} acts as a base of the game.
 * @author hcyjs2
 *
 */
public class World extends Pane {
    private AnimationTimer timer;
    
    /**
     * To define the game behavior based on the actions done by player.
     */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}
				
			}
    		
		});
    }
    
    /**
     * To create a timer for the actors to act
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }
    
    /**
     * To start the time stamp.
     */
    public void start() {
    	createTimer();
        timer.start();
    }
    
    /**
     * To resume the time stamp.
     */
    public void resume() {
    	timer.start();
    }
    
    /**
     * To stop the time stamp.
     */
    public void stop() {
        timer.stop();
    }
    
    /**
     * To add specific actors to the World base.
     * @param actor the actor to be added
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }
    
    /**
     * To remove specific actors to the World base.
     * @param actor the actor to be removed.
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }
    
    /**
     * Get the actors in the World base
     * @param <A> the type of actors
     * @param cls the actors class
     * @return An ArrayList that contains actors.
     */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }

    public void act(long now) {
    	
    }
}
