package genericUtility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author ManojKumarPS
 */

public class JavaUtility {
	/**
	 * This method is used to capture current system date and time
	 * @return String
	 */
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will return random numbers within 1000 
	 * @return integer
	 */
	
	public int RandomNum() {
		Random ran=new Random();
		return ran.nextInt(1000);
		
	}
}
