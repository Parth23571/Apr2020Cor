import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	public 	static			 WebDriver driver=null;
public static	 File F=null;
public static	 FileInputStream fis=null;
public static	 Properties p=null;

	public WebElement getElementByName(String Name)
	{
		WebElement name=null;
		try
		{
			name=driver.findElement(By.name(p.getProperty(Name)));
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return name;
	}
	public void init()
	{
		try
		{
			  WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
 String strPath="E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\myProperty.properties";
F=new File(strPath);
 fis=new FileInputStream(F);
p=new Properties();
 p.load(fis);

		}
	catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}
	
	public void getElementID(String ID)
	{
		
	}
}
