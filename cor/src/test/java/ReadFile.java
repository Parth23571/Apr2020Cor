import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.annotations.Test;

public class ReadFile {
  @Test
  public void f() {
	  try
	  {
		  File F=new File("E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\myFile.txt");
		  
		  FileReader fr=new FileReader(F);
		  BufferedReader br=new BufferedReader(fr);
		  
String a=		  br.readLine();
		 while(a!=null)
		 {
			 System.out.println(a);
			 a=br.readLine();
		 }
		  br.close();
		 File Fl=new File("E:\\Satish\\Automation\\Selenium\\cor\\cor\\src\\main\\java\\TestData\\delete");
String [] st=		Fl.list();
		 for(String ss:st)
		 {
			 System.out.println(ss);
		 }
	  }
  catch(Exception e)
	  {
	  System.out.println(e.getMessage());
	  }
  }
}
