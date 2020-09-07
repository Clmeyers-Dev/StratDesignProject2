/**
 * This class implements subject and creates an array list of observers. 
 * @author Christopher Meyers
 *
 */

import java.util.ArrayList;
public class Cook implements Subject{
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String name;
	
	/**
	 * This method creates a Cook using the parameter String name. sets the name of the cook to be the name given by the parameter
	 * @param name
	 */
	public Cook(String name) {
		this.name = name;
	}
	
	
	/**
	 * This method Takes in an observer and then removes them to the ArrayList observers.
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * This method takes in a String location and String description. It updates the observer to have the set parameters
	 */
	@Override
	public void notifyObserver(String location, String description) {
		for(Observer observer : observers) {
			observer.update(location, description);
		}
	}
	/**
	 * This method Takes in an observer then adds them to the Array List "observers".
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * This method takes in a location and description. If the name matches the current subject then it notifies the observer.
	 * @param location
	 * @param description
	 */
	public void enterSighting(String location, String description) {
		if(name.equalsIgnoreCase("Heinzenberg")) {
		notifyObserver(location, description);
		}
	}
	
	/**
	 * This string returns the name of the subject and takes in no parameters.
	 * @return
	 */
	public String getName() {
		return name;
	}

}

