import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void f() {
	  
	  
	  try
	  {
		 // SoftAssert s=new SoftAssert();
	  
		  System.out.println("Before");
			Assert.assertEquals(true, false);
		  //s.assertEquals(true, false);
		  System.out.println("After");
	  //s.assertAll();
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
}
