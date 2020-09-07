import java.util.ArrayList;

/**
 * This class creates a DEA officer who keeps track of a Subject. he notes their location and description, then updates his log
 * @author Christopher Meyers
 *
 */
public class DEA implements Observer {
	
	Subject cook;
	private ArrayList<String> locations = new ArrayList<String>();
	private String notes;
	
	
	/**
	 * This method creates a DEA member with the parameter Subject cook. 
	 * @param cook
	 */
	public DEA(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
	}
	
	
	/**
	 * This method takes in a String Location and a String Description. It adds a location to the locations ArrayList. It then adds the description to the notes section 
	 */
	@Override
	public void update(String location, String description) {
		locations.add(location);
		if (notes!=null)
			notes = notes + "\n" + description;
		else
			notes = description;
	}
	
	
	/**
	 * This method takes in no parameters and returns a String. It generates a string "a" that contains the first line of the notes section. Then it generates all of the names of the loctions in order and prints them.
	 */
	@Override
	public String getLog() {
		String a = "Locations:\n";
		for (String name : locations) {
			a = a + name + "\n";
		}
		a = a + "\nNotes:\n";
		a = a + notes;
		return a;
	}
}
