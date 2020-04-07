import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetProperty {
  @Test
  public void f() {
	  try
	  {
		  String strPath="E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\myProperty.properties";
		  File F=new File(strPath);
		  FileInputStream fis=new FileInputStream(F);
		  Properties p=new Properties();
		  p.load(fis);
		  System.out.println(p.getProperty("un"));
		  System.out.println(p.getProperty("pwd"));
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
}
