
/**
 * This interface is implemented by the DEA and cartel Class
 * @author Christopher Meyers
 *
 */
public interface Observer {
	
	public void update(String location, String Description);
	
	/**
	 * This method is used by the DEA and Cartel method
	 * @return
	 */
	public String getLog();

}
