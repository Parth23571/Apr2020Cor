import org.testng.annotations.Test;

public class TestNG {

	  @Test(priority=-1)
	  public void b() {
		  System.out.println("priority-b-0");
	  }
	  
	
  @Test
  public void a() {
	  System.out.println("priority-a");
  }
  
  @Test(priority=0)
  public void f() {
	  System.out.println("No priority");
  }
  
}
