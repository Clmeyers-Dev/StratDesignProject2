/**
 * This class is used to register, remove, and notify observers. it is implemented by the Cook class.
 * @author Christopher Meyers
 *
 */
public interface Subject {
	
	/**
	 * This method is used within the Cook Class. It registers an Observer 
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * This method is used within the Cook Class. It removes an Observer
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * This method is used in the Cook class and notifies an observer of the location and description of the Subject. 
	 * @param location
	 * @param description
	 */
	public void notifyObserver(String location, String description);
	

}

