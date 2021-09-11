package cucumberautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\Desktop\\Selenium softwares\\cucumber\\Automation\\src\\test\\java\\details.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
