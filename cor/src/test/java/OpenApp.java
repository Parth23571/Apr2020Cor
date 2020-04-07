import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


public class OpenApp extends Utility {
	@Test
	public void f() {
		try {
			init();
			driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			getElementByName("txtName").sendKeys(Keys.SHIFT, "Hello");
			System.out.println("Done");
			
File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(myFile, new File("E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\a.png"));
System.out.println("Done1");

		}

		catch (Exception e) {

		}
	}
}
