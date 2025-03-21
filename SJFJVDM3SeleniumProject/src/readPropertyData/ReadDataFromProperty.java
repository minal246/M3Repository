package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//TO specify the location of the file
	FileInputStream fis	= new FileInputStream("./testData/config.properties");
	
	//To make the file ready to read
	Properties prop = new Properties();
	prop.load(fis);
	
	String data = prop.getProperty("email");
	
	//To read the data from property file
	System.out.println(data);

	}

}
