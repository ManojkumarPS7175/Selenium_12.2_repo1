package genericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author ManojKumarPS
 */
public class FileUtility {
	/**
	 * This method is used to read data from the property file
	 * by taking key from the caller
	 * @param Key
	 * @return value
	 * @throws IOException
	 */
	public String getDatafromProperty(String Key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}

}