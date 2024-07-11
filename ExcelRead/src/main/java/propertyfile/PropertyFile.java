package propertyfile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public static void main(String[] args) throws IOException 
	{

		FileReader f= new FileReader("C:\\Users\\u42950\\git\\ExcelRead\\ExcelRead\\src\\main\\resources\\login.properties");

		Properties p= new Properties();

		p.load(f);

		System.out.println(p.getProperty("username"));

		System.out.println(p.getProperty("password"));

}
	
}
