import java.util.ArrayList;

/**
 * @author Christopher Meyers
 *
 */
public class Cartel  implements Observer {
	
	
	/**
	 * This nested Class generates the location and details for the Cartel.
	 */
	public class Sighting {
		
		
		private String location;
		private String details;
		
		/**
		 * This method creates the public class Sighting
		 * @param location
		 * @param details
		 */
		public Sighting(String location, String details) {
			this.location = location;
			this.details = details;
		}
		
		/**
		 * This method takes in no parameters and returns a location
		 * @return
		 */
		public String getLocation() {
			return this.location;
		}
		
		/**
		 * This method takes in no parameters and returns the details
		 * @return
		 */
		public String getDetails() {
			return this.details;
		}

	}

	
	public Subject cook;
	private ArrayList<Sighting> sightings = new ArrayList<Sighting>();
	
	
	/**
	 * This method takes in a Subject and registers an observer
	 * @param cook
	 */
	public Cartel(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
	}
	
	/**
	 * This method takes in a String Location and a String Description. It creates a new sighting based on the two parameters
	 */
	@Override
	public void update(String location, String description) {
		sightings.add(new Sighting(location, description));
	}
	
	/**
	 * This method takes in no parameters and returns a String. It generates a string "s" using the current location and the details. The strings are seperated by "\n". s is then returned
	 */
	@Override
	public String getLog() {
		String s = "";
		for (Sighting sighting : sightings) {
			s = s + sighting.getLocation() + " (" + sighting.getDetails() + ")\n";
		}
		return s;
	}
}

